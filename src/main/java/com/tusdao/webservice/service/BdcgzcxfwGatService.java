package com.tusdao.webservice.service;

/**
 * @author yueli
 * @date 2019-08-17 12:07
 */
public interface BdcgzcxfwGatService {
    /**
     * 根据接口规范，传入相应参数调用该接口，查询不动产登记信息。
     * 使用场景：供海南省公安厅调用，将具体查询结果反馈给接口调用方
     * @param USERNAME 用户名
     * @param PASSWORD 密码
     * @param DATA 具体的查询报文信息
     * @return
     */
    String gzcxfw_gat_Info(String USERNAME, String PASSWORD, String DATA);


}
