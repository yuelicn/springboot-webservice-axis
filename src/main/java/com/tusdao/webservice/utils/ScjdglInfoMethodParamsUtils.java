package com.tusdao.webservice.utils;

import com.tusdao.base.utils.Base64Utils;
import com.tusdao.base.utils.XmlUtils;

import java.util.HashMap;
import java.util.Map;

import static com.tusdao.webservice.enums.WsInterfaceName.*;
import static com.tusdao.webservice.enums.WsWxFieldNameEnum.*;

/**
 * @author yueli
 * @date 2019-08-17 11:58
 */
public class ScjdglInfoMethodParamsUtils {
    public static String createScjdglParams(String username, String password, String bdczh, String dz) {
        Map<String, String> xmlMap = new HashMap<>(4);
        xmlMap.put(SCJDGL_FILED_USERNAME.getFieldName(), username);
        xmlMap.put(SCJDGL_FILED_PASSWORD.getFieldName(), password);
        xmlMap.put(SCJDGL_FILED_BDCZH.getFieldName(), bdczh);
        xmlMap.put(SCJDGL_FILED_DZ.getFieldName(), dz);
        String wxcxParams = Base64Utils.encodeToStr(XmlUtils.makeXML(SCJDGL_INFO.getName()
                , xmlMap));
        return ContractUtils.contructParamBase64(SCJDGL_INFO.getName(), "", wxcxParams);
    }
}
