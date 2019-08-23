package com.tusdao.webservice.service.impl;

import com.tusdao.base.configuration.SpringUtil;
import com.tusdao.webservice.service.ZwwwJkService;
import com.tusdao.webservice.utils.ContractUtils;
import com.tusdao.webservice.utils.ZwwwJkMethodParamsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.tusdao.webservice.enums.WsInterfaceName.*;

/**
 * @author yueli
 * @date 2019-08-17 12:36
 */
public class ZwwwJkServiceImpl implements ZwwwJkService {
    private static Logger logger = LoggerFactory.getLogger(CatalogInfoImpl.class);

    ContractUtils contractParams = SpringUtil.getBean(ContractUtils.class);
    @Override
    public String zwww_common_Info(String int_Xml) {
        logger.info("zwww_common_Info: 入参- int_Xml:{}", int_Xml);

        String wxcx = ZwwwJkMethodParamsUtils.createCommonParams(int_Xml);
        String responseStr = contractParams.remoteConstruct(ZWWW_COMMON_INFO.getName(), wxcx);

        logger.info("zwww_common_Info: 出参- responseStr:{}", responseStr);
        return responseStr;
    }
}
