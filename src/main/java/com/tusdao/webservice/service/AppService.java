package com.tusdao.webservice.service;

/**
 * @author yueli
 * @date 2019-08-17 15:14
 */
public interface AppService {
    /**
     * 用于APP用户的创建，用户在APP端人脸识别实名认证通过以后，继续在国土厅服务端进行认证，调用该接口。
     *
     * @param APPID    用户ID
     * @param XM       姓名
     * @param SFZH     身份证号
     * @param SJH      手机号
     * @param mac_id   预定用户
     * @param password 约定密码
     * @return
     */
    String appcxjk_hlw_apprz_Info_cs(String APPID, String XM, String SFZH, String SJH, String mac_id, String password);

    /**
     * 用于注销APP用户
     *
     * @param APPID    用户ID
     * @param XM       姓名
     * @param SFZH     身份证号
     * @param SJH      手机号
     * @param mac_id   预定用户
     * @param password 约定密码
     * @return
     */
    String appcxjk_hlw_apprzzx_Info_cs(String APPID, String XM, String SFZH, String SJH, String mac_id,
                                       String password);

    /**
     * 主要查询APP用户的认证信息
     *
     * @param APPID    用户ID
     * @param SJH      手机号
     * @param mac_id   预定用户
     * @param password 约定密码
     * @return
     */
    String appcxjk_hlw_apprzcx_Info_cs(String APPID, String SJH, String mac_id, String password);

    /**
     * 主要查询APP用户的房屋信息
     *
     * @param APPID    用户ID
     * @param SJH      手机号
     * @param mac_id   预定用户
     * @param password 约定密码
     * @return
     */
    String appcxjk_hlw_appfwcx_Info_cs(String APPID, String SJH, String mac_id, String password);

    /**
     * 主要查询APP用户的合同交易信息
     *
     * @param APPID    用户ID
     * @param SJH      手机号
     * @param mac_id   预定用户
     * @param password 约定密码
     * @return
     */
    String appcxjk_hlw_appjycx_Info_cs(String APPID, String SJH, String mac_id, String password);

    /**
     * 主要查询APP用户对应合同的完税信息
     *
     * @param APPID    用户ID
     * @param SJH      手机号
     * @param HTBH     合同编号
     * @param mac_id   预定用户
     * @param password 约定密码
     * @return
     */
    String appcxjk_hlw_appwscx_Info_cs(String APPID, String SJH, String HTBH, String mac_id, String password);
    /**
     * 主要查询APP用户对应合同的完税信息
     *
     * @param APPID    用户ID
     * @param SJH      手机号
     * @param QRCODE    二维码字符串
     * @param mac_id   预定用户
     * @param password 约定密码
     * @return
     */
    String appcxjk_hlw_appzsyz_Info_cs(String APPID, String SJH, String QRCODE, String mac_id, String password);


}
