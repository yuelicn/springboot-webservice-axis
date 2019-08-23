package com.tusdao.webservice.service;


/**
 * @author yueli
 * @date 2019-08-05 19:14
 */
public interface WebService {
    /**
     * 主要用于校验此微信号是否准许访问查询不动产登记信息接口，微信在聚合数据三网实名认证通过以后，
     * 继续在国土厅服务端进行认证，调用该接口返回是否认证成功或者失败的信息
     *
     * @param WXID     微信ID
     * @param XM       姓名
     * @param SFZH     身份证号
     * @param SJH      手机号
     * @param mac_id   预定用户
     * @param password 密码
     * @return 查询结果 Base64字符串
     */
    String gzcxfw_hlw_wxrz_Info_cs(String WXID, String XM, String SFZH, String SJH, String mac_id, String password);

    /**
     * 调用该接口返回不动产（房地产权）查询结果信息
     *
     * @param WXID     微信ID
     * @param password 密码
     * @param mac_id   预定用户
     * @return 查询结果Base64串
     */
    String gzcxfw_hlw_wxcx_Info_cs(String WXID, String password, String mac_id);

    /**
     * 调用该接口返回不动产（房地产权）查询结果以及关联合同信息
     *
     * @param WXID     微信ID
     * @param password 预定密码
     * @param mac_id   预定用户
     * @return
     */
    String gzcxfw_hlw_wxdj_Info_cs(String WXID, String password, String mac_id);

    /**
     * 主要用于注销对应的微信号用户，是否准许访问查询不动产登记信息接口，微信在聚合数据三网实名认证通过以后，
     * 继续在国土厅服务端进行认证，调用该接口返回是否认证成功或者失败的信息
     *
     * @param WXID 微信ID
     * @param password 约定密码
     * @param mac_id 预定用户
     * @return
     */
    String gzcxfw_hlw_wxzr_zx_Info_cs(String WXID, String password, String mac_id);

    /**
     *  主要用于微信号用户忘记前端应用的密码时，验证注册信息，重设前端应用密码
     * @param WXID 微信ID
     * @param SJH 身份证号
     * @param mac_id 约定用户
     * @param password 预定密码
     * @return
     */
    String gzcxfw_hlw_wjmm_Info_cs(String WXID, String SJH, String mac_id, String password );

    /**
     *
     * @param Int_Xml
     * @return
     */
    String gzcxfw_nw_wxcx_Info_cs(String Int_Xml);


}
