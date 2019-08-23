package com.tusdao.webservice.service.impl;

import com.tusdao.base.configuration.SpringUtil;
import com.tusdao.webservice.service.BdcgzcxfwService;
import com.tusdao.webservice.utils.BdcgzcxfwMethodParamsUtils;
import com.tusdao.webservice.utils.ContractUtils;
import com.tusdao.webservice.utils.WebServiceMethodParamsUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.tusdao.webservice.enums.WsInterfaceName.*;

/**
 * @author yueli
 * @date 2019-08-17 10:47
 */
public class BdcgzcxfwServiceImpl implements BdcgzcxfwService {

    private static Logger logger = LoggerFactory.getLogger(CatalogInfoImpl.class);

    ContractUtils contractParams = SpringUtil.getBean(ContractUtils.class);

    @Override
    public String gzcxfw_hlw_Info(String Int_Xml, String xm, String mac_id, String password) {
        logger.info("gzcxfw_hlw_Info: 入参- Int_Xml:{}, xm:{}, mac_id:{}, password:{}", Int_Xml, xm, mac_id, password);

        String wsdj = BdcgzcxfwMethodParamsUtils.createHlwParams(Int_Xml, xm, mac_id, password);
        String responseStr = contractParams.remoteConstruct(GZCXFW_HLW_INFO.getName(), wsdj);

        logger.info("gzcxfw_hlw_Info: 出参- responseStr:{}", responseStr);
        return responseStr;


    }

    @Override
    public String gzcxfw_fpb_Info(String ZJH, String XM, String MAC, String PASSWORD) {
        logger.info("gzcxfw_fpb_Info: 入参- ZJH:{}, XM:{}, MAC:{}, PASSWORD:{}", ZJH, XM, MAC, PASSWORD);

        String wsdj = BdcgzcxfwMethodParamsUtils.createFpbParams(ZJH, XM, MAC, PASSWORD);
        String responseStr = contractParams.remoteConstruct(GZCXFW_FPB_INFO.getName(), wsdj);

        logger.info("gzcxfw_fpb_Info: 出参- responseStr:{}", responseStr);
        return responseStr;
    }

    @Override
    public String gzcxfw_ds_Info(String Int_Xml, String xm, String mac_id, String password, String zxcxdw, String zxr) {
        logger.info("gzcxfw_ds_Info: 入参- Int_Xml:{}, xm:{}, mac_id:{}, password:{}, zxcxdw:{}, zxr{}", Int_Xml, xm,
                mac_id
                , password, zxcxdw, zxr);

        String wsdj = BdcgzcxfwMethodParamsUtils.createDsParams(Int_Xml, xm, mac_id
                , password, zxcxdw, zxr);
        String responseStr = contractParams.remoteConstruct(GZCXFW_DS_INFO.getName(), wsdj);

        logger.info("gzcxfw_ds_Info: 出参- responseStr:{}", responseStr);
        return responseStr;
    }
}
