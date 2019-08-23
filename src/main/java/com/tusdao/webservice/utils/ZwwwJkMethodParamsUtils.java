package com.tusdao.webservice.utils;

import com.tusdao.base.utils.Base64Utils;
import com.tusdao.base.utils.XmlUtils;

import java.util.HashMap;
import java.util.Map;

import static com.tusdao.webservice.enums.WsInterfaceName.*;
import static com.tusdao.webservice.enums.WsWxFieldNameEnum.*;

/**
 * @author yueli
 * @date 2019-08-17 12:39
 */
public class ZwwwJkMethodParamsUtils {
    public static String createCommonParams(String int_xml) {
        Map<String, String> xmlMap = new HashMap<>(1);
        xmlMap.put(ZWWW_FILED_INT_XML.getFieldName(), int_xml);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(ZWWW_COMMON_INFO.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(ZWWW_COMMON_INFO.getName(), "", wxcxParams);
    }
}
