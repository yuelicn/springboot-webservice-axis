package com.tusdao.webservice.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tusdao.base.configuration.ContractConfig;
import com.tusdao.base.utils.Base64Utils;
import com.tusdao.base.utils.HttpUtils;
import com.tusdao.webservice.model.CatalogInfo;
import com.tusdao.webservice.service.ICatalogInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 封装 contract 请求参数
 *
 * @author yueli
 * @date 2019-08-07 13:10
 */
@Component
public class ContractUtils {
    private static Logger logger = LoggerFactory.getLogger(ContractUtils.class);

    @Autowired
    ICatalogInfo catalogInfo;

    @Autowired
    ContractConfig contractConfig;

    public static String contructParamBase64(String methodName, String SOAPAction, String body) {
        Map<String, String> requestMap = new HashMap<>(3);
        requestMap.put("SOAPAction", SOAPAction);
        requestMap.put("InterfaceName", methodName);
        requestMap.put("Body", body);
        JSONObject requestParam = JSONObject.parseObject(JSON.toJSONString(requestMap));
        String requestParams = Base64Utils.encodeToStr(requestParam.toJSONString());
        return requestParams;
    }

    /**
     * 封装请求合约参数
     *
     * @param methodName       方法名
     * @param webServiceParams base64(webServiceParams)
     * @return
     */
    public JSONObject createContractParams(String methodName, String webServiceParams) {

        CatalogInfo byWsMethod = catalogInfo.findByWsMethod(methodName, contractConfig.getIssuer());

        if (null == byWsMethod) {
            logger.info("查询信息不存在");
            throw new RuntimeException("合约信息不存在");
        }

        if (StringUtils.isEmpty(byWsMethod.getContractId())
                || StringUtils.isEmpty(byWsMethod.getTaskInitiator())) {
            logger.info("合约信息不完整：interface:{}, contractId:{}, taskInitiator:{}", methodName, byWsMethod.getContractId(),
                    byWsMethod.getTaskInitiator());
            throw new RuntimeException("合约信息不完整");
        }

        Map<String, String> paramsMap = new HashMap<>(3);
        paramsMap.put(Constant.ADDRESS, byWsMethod.getContractId());
        paramsMap.put(Constant.PARAMBASE64, webServiceParams);
        paramsMap.put(Constant.ISSUER, byWsMethod.getTaskInitiator());
        JSONObject requestParam = JSONObject.parseObject(JSON.toJSONString(paramsMap));
        logger.debug("远程请求合约请求参数：{}", requestParam);
        return requestParam;
    }

    /**
     * 发送http请求，调用合约
     *
     * @param methodName       接口名称
     * @param webServiceParams webservice 参数封装
     * @return
     */
    public String remoteConstruct(String methodName, String webServiceParams) {

        String responseStr = null;
        try {
            responseStr = new HttpUtils().post(createContractParams(methodName, webServiceParams)
                    , contractConfig.getConstarctUrl(), new HashMap<>(0));
        } catch (Exception e) {
            logger.error("远程调用合约失败：url:{}, e:{}", contractConfig.getConstarctUrl(), e);
            throw new RuntimeException("remote switch http error: code:" + 500 + "," + e.getMessage());
        }

        return parseJson(responseStr);
    }

    /**
     * 对http响应结果进行解析
     *
     * @param jsonStr Json格式字符串
     * @return
     */
    private static String parseJson(String jsonStr) {
        if (StringUtils.isEmpty(jsonStr)) {
            logger.info("调用合约响应为空");
            throw new RuntimeException("remote switch error: response is null");
        }

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        String code = jsonObject.getString(Constant.CODE);

        // 校验switch response code 是否为200
        if (!Constant.S_CODE.equals(code)) {
            String msg = jsonObject.getString(Constant.MSG);
            throw new RuntimeException("switch error:" + code + "," + msg);
        }

        // 处理 data 并校验
        JSONObject data = jsonObject.getJSONObject(Constant.DATA);
        if (null == data) {
            throw new RuntimeException("switch error:" + code + ", data is null");
        }

        // 处理result 并校验
        JSONObject result = data.getJSONObject(Constant.RESULT);
        if (null == result) {
            throw new RuntimeException("switch error:" + code + ", result is null");
        }
        String resultCode = result.getString(Constant.CODE);
        if (!Constant.S_CODE.equals(resultCode)) {
            throw new RuntimeException(result.getString(Constant.MSG));
        }
        return result.getString(Constant.DATA);
    }


}
