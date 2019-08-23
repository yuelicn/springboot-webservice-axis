package com.tusdao.webservice.utils;

import com.tusdao.base.utils.Base64Utils;
import com.tusdao.base.utils.XmlUtils;

import java.util.HashMap;
import java.util.Map;

import static com.tusdao.webservice.enums.WsInterfaceName.*;
import static com.tusdao.webservice.enums.WsWxFieldNameEnum.*;

/**
 * @author yueli
 * @date 2019-08-17 11:11
 */
public class BdcgzcxfwMethodParamsUtils {

    public static String createHlwParams(String int_xml, String xm, String mac_id, String password) {
        Map<String, String> xmlMap = new HashMap<>(4);
        xmlMap.put(HLW_FILED_INT_XML.getFieldName(), int_xml);
        xmlMap.put(HLW_FILED_XM.getFieldName(), xm);
        xmlMap.put(HLW_FILED_MAC_ID.getFieldName(), mac_id);
        xmlMap.put(HLW_FILED_PASSWORD.getFieldName(), password);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(GZCXFW_HLW_INFO.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(GZCXFW_HLW_INFO.getName(), "", wxcxParams);
    }

    public static String createFpbParams(String zjh, String xm, String mac, String password) {
        Map<String, String> xmlMap = new HashMap<>(4);
        xmlMap.put(FBP_FILED_ZJH.getFieldName(), zjh);
        xmlMap.put(FBP_FILED_XM.getFieldName(), xm);
        xmlMap.put(FBP_FILED_MAC.getFieldName(), mac);
        xmlMap.put(FBP_FILED_PASSWORD.getFieldName(), password);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(GZCXFW_FPB_INFO.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(GZCXFW_FPB_INFO.getName(), "", wxcxParams);
    }

    public static String createDsParams(String int_xml, String xm, String mac_id, String password, String zxcxdw,
                                        String zxr) {
        Map<String, String> xmlMap = new HashMap<>(6);
        xmlMap.put(DS_FILED_INT_XML.getFieldName(), int_xml);
        xmlMap.put(DS_FILED_XM.getFieldName(), xm);
        xmlMap.put(DS_FILED_MAC_ID.getFieldName(), mac_id);
        xmlMap.put(DS_FILED_PASSWORD.getFieldName(), password);
        xmlMap.put(DS_FILED_ZXCXDW.getFieldName(), zxcxdw);
        xmlMap.put(DS_FILED_ZXR.getFieldName(), zxr);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(GZCXFW_DS_INFO.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(GZCXFW_DS_INFO.getName(), "", wxcxParams);
    }
}
