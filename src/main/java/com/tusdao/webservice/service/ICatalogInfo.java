package com.tusdao.webservice.service;

import com.tusdao.webservice.model.CatalogInfo;

/**
 * @author yueli
 * @date 2019-08-07 15:34
 */
public interface ICatalogInfo {
    /**
     * 根据接口名称查询对应的合约信息
     * @param wsMethod
     * @param issuer
     * @return
     */
    CatalogInfo findByWsMethod(String wsMethod, String issuer);
}
