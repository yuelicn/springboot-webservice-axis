package com.tusdao.webservice.service;

/**
 * @author yueli
 * @date 2019-08-17 11:52
 */
public interface ScjdglInfoService {
    /**
     * 省市场监督管理局核查不动产信息
     *
     * @param USERNAME 用户名
     * @param PASSWORD 密码
     * @param BDCZH    不动产权证号
     * @param DZ       地址
     * @return
     */
    String scjdgl_Info(String USERNAME, String PASSWORD, String BDCZH, String DZ);


}
