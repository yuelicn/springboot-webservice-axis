package com.tusdao.webservice.service;

/**
 * @author yueli
 * @date 2019-08-17 10:37
 */
public interface BdcgzcxfwService {
    /**
     * 自助查询机查询不动产信息
     * @param Int_Xml 证件号
     * @param xm 姓名
     * @param mac_id 账号
     * @param password 密码
     * @return
     */
    String gzcxfw_hlw_Info(String Int_Xml, String xm, String mac_id, String password);

    /**
     * 扶贫办查询不动产信息
     * @param ZJH 证件号
     * @param XM 姓名
     * @param MAC 账号
     * @param PASSWORD 密码
     * @return
     */
    String gzcxfw_fpb_Info(String ZJH, String XM, String MAC, String PASSWORD);

    /**
     * 地税局查询不动产信息
     * @param Int_Xml 证件号
     * @param xm 姓名
     * @param mac_id 账号
     * @param password 密码
     * @param zxcxdw 执行查询单位
     * @param zxr 执行人
     * @return
     */
    String gzcxfw_ds_Info(String Int_Xml, String xm, String mac_id, String password, String zxcxdw, String zxr);




}
