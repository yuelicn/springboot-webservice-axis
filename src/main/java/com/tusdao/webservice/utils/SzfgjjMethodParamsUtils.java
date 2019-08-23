package com.tusdao.webservice.utils;

import com.tusdao.base.utils.Base64Utils;
import com.tusdao.base.utils.XmlUtils;

import java.util.HashMap;
import java.util.Map;

import static com.tusdao.webservice.enums.WsInterfaceName.*;
import static com.tusdao.webservice.enums.WsWxFieldNameEnum.*;

/**
 * @author yueli
 * @date 2019-08-18 11:49
 */
public class SzfgjjMethodParamsUtils {
    public static String createBdcdyhParams(String username, String password, String cxdwmc, String cbr, String xm,
                                            String zjzl, String zjh, String bdcdyh, String cxqqdh) {
        Map<String, String> xmlMap = new HashMap<>(9);
        xmlMap.put(JK_FILED_USERNAME.getFieldName(), username);
        xmlMap.put(JK_FILED_USERNAME.getFieldName(), password);
        xmlMap.put(JK_FILED_CXDWMC.getFieldName(), cxdwmc);
        xmlMap.put(JK_FILED_CBR.getFieldName(), cbr);
        xmlMap.put(JK_FILED_XM.getFieldName(), xm);
        xmlMap.put(JK_FILED_ZJZL.getFieldName(), zjzl);
        xmlMap.put(JK_FILED_ZJH.getFieldName(), zjh);
        xmlMap.put(JK_FILED_BDCDYH.getFieldName(), bdcdyh);
        xmlMap.put(JK_FILED_CXQQDH.getFieldName(), cxqqdh);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(SZFGJJ_BDCDYH_INFO.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(SZFGJJ_BDCDYH_INFO.getName(), "", wxcxParams);
    }

    public static String createZjhParams(String username, String password, String cxdwmc, String cbr, String xm,
                                         String zjzl, String zjh, String cxqqdh) {
        Map<String, String> xmlMap = new HashMap<>(8);
        xmlMap.put(JK_FILED_USERNAME.getFieldName(), username);
        xmlMap.put(JK_FILED_USERNAME.getFieldName(), password);
        xmlMap.put(JK_FILED_CXDWMC.getFieldName(), cxdwmc);
        xmlMap.put(JK_FILED_CBR.getFieldName(), cbr);
        xmlMap.put(JK_FILED_XM.getFieldName(), xm);
        xmlMap.put(JK_FILED_ZJZL.getFieldName(), zjzl);
        xmlMap.put(JK_FILED_ZJH.getFieldName(), zjh);
        xmlMap.put(JK_FILED_CXQQDH.getFieldName(), cxqqdh);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(SZFGJJ_ZJH_INFO.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(SZFGJJ_ZJH_INFO.getName(), "", wxcxParams);
    }
}
