package com.tusdao.webservice.service.impl;

import com.tusdao.base.configuration.SpringUtil;
import com.tusdao.webservice.service.ScjdglInfoService;
import com.tusdao.webservice.utils.ContractUtils;
import com.tusdao.webservice.utils.ScjdglInfoMethodParamsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.tusdao.webservice.enums.WsInterfaceName.GZCXFW_HLW_INFO;

/**
 * @author yueli
 * @date 2019-08-17 11:55
 */
public class ScjdglInfoServiceImpl implements ScjdglInfoService {
    private static Logger logger = LoggerFactory.getLogger(CatalogInfoImpl.class);

    ContractUtils contractParams = SpringUtil.getBean(ContractUtils.class);

    @Override
    public String scjdgl_Info(String USERNAME, String PASSWORD, String BDCZH, String DZ) {
        logger.info("scjdgl_Info: 入参- USERNAME:{}, PASSWORD:{}, BDCZH:{}, DZ:{}", USERNAME, PASSWORD, BDCZH, DZ);

        String wsdj = ScjdglInfoMethodParamsUtils.createScjdglParams(USERNAME, PASSWORD, BDCZH, DZ);
        String responseStr = contractParams.remoteConstruct(GZCXFW_HLW_INFO.getName(), wsdj);

        logger.info("gzcxfw_hlw_Info: 出参- responseStr:{}", responseStr);
        return responseStr;
    }
}
