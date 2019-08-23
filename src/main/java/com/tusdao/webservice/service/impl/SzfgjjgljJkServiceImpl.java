package com.tusdao.webservice.service.impl;

import com.tusdao.base.configuration.SpringUtil;
import com.tusdao.webservice.service.SzfgjjgljJkService;
import com.tusdao.webservice.utils.ContractUtils;
import com.tusdao.webservice.utils.ScjdglInfoMethodParamsUtils;
import com.tusdao.webservice.utils.SzfgjjMethodParamsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.tusdao.webservice.enums.WsInterfaceName.*;

/**
 * @author yueli
 * @date 2019-08-18 11:42
 */
public class SzfgjjgljJkServiceImpl implements SzfgjjgljJkService {
    private static Logger logger = LoggerFactory.getLogger(SzfgjjgljJkServiceImpl.class);

    ContractUtils contractParams = SpringUtil.getBean(ContractUtils.class);

    @Override
    public String szfgjj_bdcdyh_Info(String USERNAME, String PASSWORD, String CXDWMC, String CBR, String XM,
                                     String ZJZL, String ZJH, String BDCDYH, String CXQQDH) {
        logger.info("szfgjj_bdcdyh_Info: 入参- USERNAME:{}, PASSWORD:{}, CXDWMC:{}, CBR:{}, XML{}, ZJZL:{}, ZJH:{}, " +
                        "BDCDYH:{}, CXQQDH:{}", USERNAME, PASSWORD, CXDWMC, CBR
                , XM, ZJZL, ZJH, BDCDYH, CXQQDH);

        String wsdj = SzfgjjMethodParamsUtils.createBdcdyhParams(USERNAME, PASSWORD, CXDWMC, CBR
                , XM, ZJZL, ZJH, BDCDYH, CXQQDH);
        String responseStr = contractParams.remoteConstruct(SZFGJJ_BDCDYH_INFO.getName(), wsdj);

        logger.info("szfgjj_bdcdyh_Info: 出参- responseStr:{}", responseStr);
        return responseStr;
    }

    @Override
    public String szfgjj_zjh_Info(String USERNAME, String PASSWORD, String CXDWMC, String CBR, String XM, String ZJZL
            , String ZJH, String CXQQDH) {
        logger.info("szfgjj_zjh_Info: 入参- USERNAME:{}, PASSWORD:{}, CXDWMC:{}, CBR:{}, XML{}, ZJZL:{}, ZJH:{}, " +
                        "CXQQDH:{}", USERNAME, PASSWORD, CXDWMC, CBR
                , XM, ZJZL, ZJH, CXQQDH);

        String wsdj = SzfgjjMethodParamsUtils.createZjhParams(USERNAME, PASSWORD, CXDWMC, CBR
                , XM, ZJZL, ZJH, CXQQDH);
        String responseStr = contractParams.remoteConstruct(SZFGJJ_ZJH_INFO.getName(), wsdj);

        logger.info("szfgjj_zjh_Info: 出参- responseStr:{}", responseStr);
        return responseStr;
    }
}
