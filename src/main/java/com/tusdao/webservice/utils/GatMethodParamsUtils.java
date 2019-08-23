package com.tusdao.webservice.utils;

import com.tusdao.base.utils.Base64Utils;
import com.tusdao.base.utils.XmlUtils;

import java.util.HashMap;
import java.util.Map;

import static com.tusdao.webservice.enums.WsInterfaceName.*;
import static com.tusdao.webservice.enums.WsWxFieldNameEnum.*;
import static com.tusdao.webservice.enums.WsWxFieldNameEnum.HLW_FILED_PASSWORD;

/**
 * @author yueli
 * @date 2019-08-18 11:22
 */
public class GatMethodParamsUtils {
    public static String createGatParams(String username, String password, String data) {
        Map<String, String> xmlMap = new HashMap<>(3);
        xmlMap.put(GAT_FILED_USERNAME.getFieldName(), username);
        xmlMap.put(GET_FILED_PASSWORD.getFieldName(), password);
        xmlMap.put(GET_FILED_DATA.getFieldName(), data);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(GZCXFW_GAT_INFO.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(GZCXFW_GAT_INFO.getName(), "", wxcxParams);
    }
}
