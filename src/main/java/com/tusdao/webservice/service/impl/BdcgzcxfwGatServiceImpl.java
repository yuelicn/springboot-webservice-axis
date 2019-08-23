package com.tusdao.webservice.service.impl;

import com.tusdao.base.configuration.SpringUtil;
import com.tusdao.webservice.service.BdcgzcxfwGatService;
import com.tusdao.webservice.utils.BdcgzcxfwMethodParamsUtils;
import com.tusdao.webservice.utils.ContractUtils;
import com.tusdao.webservice.utils.GatMethodParamsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.tusdao.webservice.enums.WsInterfaceName.*;

/**
 * @author yueli
 * @date 2019-08-18 11:17
 */
public class BdcgzcxfwGatServiceImpl implements BdcgzcxfwGatService {
    private static Logger logger = LoggerFactory.getLogger(AppServiceImpl.class);

    ContractUtils contractParams = SpringUtil.getBean(ContractUtils.class);

    @Override
    public String gzcxfw_gat_Info(String USERNAME, String PASSWORD, String DATA) {
        logger.info("gzcxfw_gat_Info: 入参- USERNAME:{}, PASSWORD:{}, DATA:{}", USERNAME, PASSWORD, DATA);

        String wsdj = GatMethodParamsUtils.createGatParams(USERNAME, PASSWORD, DATA);
        String responseStr = contractParams.remoteConstruct(GZCXFW_GAT_INFO.getName(), wsdj);

        logger.info("gzcxfw_gat_Info: 出参- responseStr:{}", responseStr);
        return responseStr;
    }
}
