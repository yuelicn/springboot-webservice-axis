package com.tusdao.webservice.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tusdao.base.utils.Base64Utils;
import com.tusdao.base.utils.XmlUtils;

import java.util.HashMap;
import java.util.Map;

import static com.tusdao.webservice.enums.WsInterfaceName.*;
import static com.tusdao.webservice.enums.WsWxFieldNameEnum.*;

/**
 * 封装 webService params to call contract params
 *
 * @author yueli
 * @date 2019-08-07 13:04
 */
public class WebServiceMethodParamsUtils {


    /**
     * 封装gzcxfw_hlw_wxcx_Info_cs接口的参数
     *
     * @param wxid
     * @param password
     * @param macId
     * @return
     */
    public static String createWxcxParams(String wxid, String password, String macId) {
        Map<String, String> xmlMap = new HashMap<>(3);
        xmlMap.put(WX_WXID.getFieldName(), wxid);
        xmlMap.put(WXCX_FIELD_PASSWOED.getFieldName(), password);
        xmlMap.put(WX_MACID.getFieldName(), macId);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(GZCXFW_HLW_WXCX_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(GZCXFW_HLW_WXCX_INFO_CS.getName(), "", wxcxParams);
    }

    /**
     * 封装gzcxfw_hlw_wxrz_Info_cs接口的参数
     *
     * @param wxid
     * @param xm
     * @param sfzh
     * @param sjh
     * @param macId
     * @param password
     * @return
     */
    public static String createWxrzParams(String wxid, String xm, String sfzh, String sjh, String macId,
                                          String password) {
        Map<String, String> xmlMap = new HashMap<>(6);
        xmlMap.put(WX_WXID.getFieldName(), wxid);
        xmlMap.put(WXRZ_FIELD_XM.getFieldName(), xm);
        xmlMap.put(WXRZ_FIELD_SFZH.getFieldName(), sfzh);
        xmlMap.put(WXRZ_FIELD_SJH.getFieldName(), sjh);
        xmlMap.put(WX_MACID.getFieldName(), macId);
        xmlMap.put(WXRZ_FIELD_PASSWORD.getFieldName(), password);
        String wxrzParams = Base64Utils.encodeToStr(XmlUtils.makeXML(GZCXFW_HLW_WXRZ_INFO_CS.getName()
                , xmlMap));

        return ContractUtils.contructParamBase64(GZCXFW_HLW_WXRZ_INFO_CS.getName(), "", wxrzParams);
    }


    public static String createWxdjParams(String wxid, String password, String mac_id) {
        Map<String, String> xmlMap = new HashMap<>(3);

        xmlMap.put(WX_WXID.getFieldName(), wxid);
        xmlMap.put(WXRZ_FIELD_PASSWORD.getFieldName(), password);
        xmlMap.put(WX_MACID.getFieldName(), mac_id);
        String wxrzParams = Base64Utils.encodeToStr(XmlUtils.makeXML(GZCXFW_HLW_WXDJ_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(GZCXFW_HLW_WXRZ_INFO_CS.getName(), "", wxrzParams);
    }

    public static String createWxzrParams(String wxid, String password, String mac_id) {
        Map<String, String> xmlMap = new HashMap<>(4);

        xmlMap.put(WX_WXID.getFieldName(), wxid);
        xmlMap.put(WXZR_FIELD_PASSWORD.getFieldName(), password);
        xmlMap.put(WX_MACID.getFieldName(), mac_id);
        String wxrzParams = Base64Utils.encodeToStr(XmlUtils.makeXML(GZCXFW_HLW_WXDJ_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(GZCXFW_HLW_WXDJ_INFO_CS.getName(), "", wxrzParams);
    }

    public static String createWjmmParams(String wxid, String sjh, String mac_id, String password) {
        Map<String, String> xmlMap = new HashMap<>(4);

        xmlMap.put(WX_WXID.getFieldName(), wxid);
        xmlMap.put(WXRZ_FIELD_SFZH.getFieldName(), sjh);
        xmlMap.put(WX_MACID.getFieldName(), mac_id);
        xmlMap.put(WXZR_FIELD_PASSWORD.getFieldName(), password);
        String wxrzParams = Base64Utils.encodeToStr(XmlUtils.makeXML(GZCXFW_HLW_WJMM_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(GZCXFW_HLW_WJMM_INFO_CS.getName(), "", wxrzParams);
    }

    public static String createNwWxcxParams(String int_xml) {
        Map<String, String> xmlMap = new HashMap<>(1);
        xmlMap.put(DS_FILED_INT_XML.getFieldName(), int_xml);
        String wxrzParams = Base64Utils.encodeToStr(XmlUtils.makeXML(GZCXFW_NW_WXCX_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(GZCXFW_NW_WXCX_INFO_CS.getName(), "", wxrzParams);
    }
}
