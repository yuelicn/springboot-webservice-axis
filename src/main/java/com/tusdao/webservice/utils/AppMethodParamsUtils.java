package com.tusdao.webservice.utils;

import com.tusdao.base.utils.Base64Utils;
import com.tusdao.base.utils.XmlUtils;

import java.util.HashMap;
import java.util.Map;

import static com.tusdao.webservice.enums.WsInterfaceName.*;
import static com.tusdao.webservice.enums.WsWxFieldNameEnum.*;
import static com.tusdao.webservice.enums.WsWxFieldNameEnum.*;

/**
 * @author yueli
 * @date 2019-08-17 16:13
 */
public class AppMethodParamsUtils {
    public static String createApprzParams(String appid, String xm, String sfzh, String sjh, String mac_id,
                                           String password) {

        Map<String, String> xmlMap = new HashMap<>(6);
        xmlMap.put(APP_FILED_APPID.getFieldName(), appid);
        xmlMap.put(APP_FILED_XM.getFieldName(), xm);
        xmlMap.put(APP_FILED_SFZH.getFieldName(), sfzh);
        xmlMap.put(APP_FILED_SJH.getFieldName(), sjh);
        xmlMap.put(APP_FILED_MAC_ID.getFieldName(), mac_id);
        xmlMap.put(APP_FILED_PASSWORD.getFieldName(), password);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(APPCXJK_HLW_APPRZ_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(APPCXJK_HLW_APPRZ_INFO_CS.getName(), "", wxcxParams);
    }

    public static String createApprzzxParams(String appid, String xm, String sfzh, String sjh, String mac_id,
                                             String password) {
        Map<String, String> xmlMap = new HashMap<>(6);
        xmlMap.put(APP_FILED_APPID.getFieldName(), appid);
        xmlMap.put(APP_FILED_XM.getFieldName(), xm);
        xmlMap.put(APP_FILED_SFZH.getFieldName(), sfzh);
        xmlMap.put(APP_FILED_SJH.getFieldName(), sjh);
        xmlMap.put(APP_FILED_MAC_ID.getFieldName(), mac_id);
        xmlMap.put(APP_FILED_PASSWORD.getFieldName(), password);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(APPCXJK_HLW_APPRZZX_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(APPCXJK_HLW_APPRZZX_INFO_CS.getName(), "", wxcxParams);
    }

    public static String createApprzcxParams(String appid, String sjh, String mac_id, String password) {
        Map<String, String> xmlMap = new HashMap<>(6);
        xmlMap.put(APP_FILED_APPID.getFieldName(), appid);
        xmlMap.put(APP_FILED_SJH.getFieldName(), sjh);
        xmlMap.put(APP_FILED_MAC_ID.getFieldName(), mac_id);
        xmlMap.put(APP_FILED_PASSWORD.getFieldName(), password);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(APPCXJK_HLW_APPRZCX_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(APPCXJK_HLW_APPRZCX_INFO_CS.getName(), "", wxcxParams);
    }

    public static String createAppfwcxParams(String appid, String sjh, String mac_id, String password) {
        Map<String, String> xmlMap = new HashMap<>(6);
        xmlMap.put(APP_FILED_APPID.getFieldName(), appid);
        xmlMap.put(APP_FILED_SJH.getFieldName(), sjh);
        xmlMap.put(APP_FILED_MAC_ID.getFieldName(), mac_id);
        xmlMap.put(APP_FILED_PASSWORD.getFieldName(), password);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(APPCXJK_HLW_APPFWCX_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(APPCXJK_HLW_APPFWCX_INFO_CS.getName(), "", wxcxParams);
    }

    public static String createAppjycxParams(String appid, String sjh, String mac_id, String password) {
        Map<String, String> xmlMap = new HashMap<>(6);
        xmlMap.put(APP_FILED_APPID.getFieldName(), appid);
        xmlMap.put(APP_FILED_SJH.getFieldName(), sjh);
        xmlMap.put(APP_FILED_MAC_ID.getFieldName(), mac_id);
        xmlMap.put(APP_FILED_PASSWORD.getFieldName(), password);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(APPCXJK_HLW_APPJYCX_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(APPCXJK_HLW_APPJYCX_INFO_CS.getName(), "", wxcxParams);
    }

    public static String createAppwscxParams(String appid, String sjh, String htbh, String mac_id, String password) {
        Map<String, String> xmlMap = new HashMap<>(6);
        xmlMap.put(APP_FILED_APPID.getFieldName(), appid);
        xmlMap.put(APP_FILED_SJH.getFieldName(), sjh);
        xmlMap.put(APP_FILED_HTBH.getFieldName(), htbh);
        xmlMap.put(APP_FILED_MAC_ID.getFieldName(), mac_id);
        xmlMap.put(APP_FILED_PASSWORD.getFieldName(), password);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(APPCXJK_HLW_APPWSCX_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(APPCXJK_HLW_APPWSCX_INFO_CS.getName(), "", wxcxParams);
    }

    public static String createHlwParams(String appid, String sjh, String qrcode, String mac_id, String password) {
        Map<String, String> xmlMap = new HashMap<>(6);
        xmlMap.put(APP_FILED_APPID.getFieldName(), appid);
        xmlMap.put(APP_FILED_SJH.getFieldName(), sjh);
        xmlMap.put(APP_FILED_QRCODE.getFieldName(), qrcode);
        xmlMap.put(APP_FILED_MAC_ID.getFieldName(), mac_id);
        xmlMap.put(APP_FILED_PASSWORD.getFieldName(), password);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(APPCXJK_HLW_APPZSYZ_INFO_CS.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(APPCXJK_HLW_APPZSYZ_INFO_CS.getName(), "", wxcxParams);
    }
}
