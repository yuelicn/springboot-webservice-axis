package com.tusdao.webservice.enums;

/**
 * @author yueli
 * @date 2019-08-07 13:24
 */
public enum WsWxFieldNameEnum {
    WX_WXID("WXID"),
    WX_MACID("mac_id"),

    WXCX_FIELD_PASSWOED("password"),

    WXRZ_FIELD_XM("XM"),
    WXRZ_FIELD_SFZH("SFZH"),
    WXRZ_FIELD_SJH("SJH"),
    WXRZ_FIELD_PASSWORD("password"),

    WXZR_FIELD_PASSWORD("password"),

    HLW_FILED_INT_XML("INT_XML"),
    HLW_FILED_XM("XM"),
    HLW_FILED_MAC_ID("MAC_ID"),
    HLW_FILED_PASSWORD("password"),

    FBP_FILED_ZJH("ZJH"),
    FBP_FILED_XM("XM"),
    FBP_FILED_MAC("MAC"),
    FBP_FILED_PASSWORD("PASSWORD"),

    DS_FILED_INT_XML("Int_Xml"),
    DS_FILED_XM("xm"),
    DS_FILED_MAC_ID("mac_id"),
    DS_FILED_PASSWORD("password"),
    DS_FILED_ZXCXDW("zxcxdw"),
    DS_FILED_ZXR("zxr"),


    SCJDGL_FILED_USERNAME("USERNAME"),
    SCJDGL_FILED_PASSWORD("PASSWORD"),
    SCJDGL_FILED_BDCZH("BDCZH"),
    SCJDGL_FILED_DZ("DZ"),

    ZWWW_FILED_INT_XML("Int_Xml"),

    APP_FILED_APPID("APPID"),
    APP_FILED_XM("XM"),
    APP_FILED_SFZH("SFZH"),
    APP_FILED_SJH("SJH"),
    APP_FILED_MAC_ID("mac_id"),
    APP_FILED_PASSWORD("password"),
    APP_FILED_QRCODE("QRCODE"),
    APP_FILED_HTBH("HTBH"),

    GAT_FILED_USERNAME("USERNAME"),
    GET_FILED_PASSWORD("PASSWORD"),
    GET_FILED_DATA("DATA"),

    JK_FILED_USERNAME("USERNAME"),
    JK_FILED_PASSWORD("PASSWORD"),
    JK_FILED_CXDWMC("CXDWMC"),
    JK_FILED_CBR("CBR"),
    JK_FILED_XM("XM"),
    JK_FILED_ZJZL("ZJZL"),
    JK_FILED_ZJH("ZJH"),
    JK_FILED_BDCDYH("BDCDYH"),
    JK_FILED_CXQQDH("CXQQDH")


    ;


    String fieldName;

    WsWxFieldNameEnum(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }


}
