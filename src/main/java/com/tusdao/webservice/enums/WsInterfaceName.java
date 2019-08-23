package com.tusdao.webservice.enums;

/**
 * @author yueli
 * @date 2019-08-07 16:48
 */
public enum WsInterfaceName {

    GZCXFW_HLW_WXRZ_INFO_CS("gzcxfw_hlw_wxrz_Info_cs"),
    GZCXFW_HLW_WXCX_INFO_CS("gzcxfw_hlw_wxcx_Info_cs"),
    GZCXFW_HLW_WXDJ_INFO_CS("gzcxfw_hlw_wxdj_Info_cs"),
    GZCXFW_HLW_WXZR_ZX_INFO_CS("gzcxfw_hlw_wxzr_zx_Info_cs"),
    GZCXFW_HLW_WJMM_INFO_CS("gzcxfw_hlw_wjmm_Info_cs"),
    GZCXFW_NW_WXCX_INFO_CS("gzcxfw_nw_wxcx_Info_cs"),
    GZCXFW_HLW_INFO("gzcxfw_hlw_Info"),
    GZCXFW_FPB_INFO("gzcxfw_fpb_Info"),
    GZCXFW_DS_INFO("gzcxfw_ds_Info"),

    SCJDGL_INFO("scjdgl_Info"),

    ZWWW_COMMON_INFO("zwww_common_Info"),

    APPCXJK_HLW_APPRZ_INFO_CS("appcxjk_hlw_apprz_Info_cs"),
    APPCXJK_HLW_APPRZZX_INFO_CS("appcxjk_hlw_apprzzx_Info_cs"),
    APPCXJK_HLW_APPRZCX_INFO_CS("appcxjk_hlw_apprzcx_Info_cs"),
    APPCXJK_HLW_APPFWCX_INFO_CS("appcxjk_hlw_appfwcx_Info_cs"),
    APPCXJK_HLW_APPJYCX_INFO_CS("appcxjk_hlw_appjycx_Info_cs"),
    APPCXJK_HLW_APPWSCX_INFO_CS("appcxjk_hlw_appwscx_Info_cs"),
    APPCXJK_HLW_APPZSYZ_INFO_CS("appcxjk_hlw_appzsyz_Info_cs"),

    GZCXFW_GAT_INFO("gzcxfw_gat_Info"),

    SZFGJJ_BDCDYH_INFO("szfgjj_bdcdyh_Info"),
    SZFGJJ_ZJH_INFO("szfgjj_zjh_Info")

    ;


    String name;

    WsInterfaceName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
