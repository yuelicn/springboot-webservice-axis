package com.tusdao.webservice.service;

/**
 * @author yueli
 * @date 2019-08-18 11:38
 */
public interface SzfgjjgljJkService {
    /**
     * 省住房公积金管理局根据不动产单元号查询不动产信息
     *
     * @param USERNAME 用户名
     * @param PASSWORD 密码
     * @param CXDWMC
     * @param CBR
     * @param XM
     * @param ZJZL
     * @param ZJH
     * @param BDCDYH
     * @param CXQQDH
     * @return
     */
    String szfgjj_bdcdyh_Info(String USERNAME, String PASSWORD, String CXDWMC, String CBR, String XM, String ZJZL,
                              String ZJH, String BDCDYH, String CXQQDH);

    /**
     * 省住房公积金管理局根据姓名和证件号查询不动产信息
     * @param USERNAME
     * @param PASSWORD
     * @param CXDWMC
     * @param CBR
     * @param XM
     * @param ZJZL
     * @param ZJH
     * @param CXQQDH
     * @return
     */
    String szfgjj_zjh_Info(String USERNAME, String PASSWORD, String CXDWMC, String CBR, String XM, String ZJZL,
                           String ZJH, String CXQQDH);


}
