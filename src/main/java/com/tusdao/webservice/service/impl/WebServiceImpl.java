package com.tusdao.webservice.service.impl;

import com.tusdao.base.configuration.SpringUtil;
import com.tusdao.webservice.service.WebService;
import com.tusdao.webservice.utils.ContractUtils;
import com.tusdao.webservice.utils.WebServiceMethodParamsUtils;
import org.apache.axis.MessageContext;
import org.apache.axis.transport.http.HTTPConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

import static com.tusdao.webservice.enums.WsInterfaceName.*;


/**
 * @author yueli
 * @date 2019-08-05 19:17
 */
public class WebServiceImpl implements WebService {

    private static Logger logger = LoggerFactory.getLogger(CatalogInfoImpl.class);

    ContractUtils contractParams = SpringUtil.getBean(ContractUtils.class);


    @Override
    public String gzcxfw_hlw_wxrz_Info_cs(String wxid, String xm, String sfzh, String sjh, String macId, String password) {
        logger.info("gzcxfwHlwWxrzInfoCs: 入参- wxid:{}, xm:{}, sfzh:{}, sjh:{}, macId:{}, pawd:{}", wxid, xm, sfzh,
                sjh, macId, password);
        MessageContext messageContext = MessageContext.getCurrentContext();
        HttpServletRequest request = (HttpServletRequest)messageContext.getProperty(HTTPConstants.MC_HTTP_SERVLETREQUEST);


        String wxrz = WebServiceMethodParamsUtils.createWxrzParams(wxid, xm, sfzh, sjh, macId, password);
        String responseStr = contractParams.remoteConstruct(GZCXFW_HLW_WXRZ_INFO_CS.getName(), wxrz);

        logger.info("gzcxfwHlwWxrzInfoCs: 出参- responseStr:{}", responseStr);
        return responseStr ;
    }

    @Override
    public String gzcxfw_hlw_wxcx_Info_cs(String wxid, String password, String macId) {
        logger.info("gzcxfwHlwWxcxInfoCs: 入参- wxid:{}, macId:{}, pawd:{}", wxid, macId, password);

        String wxcx = WebServiceMethodParamsUtils.createWxcxParams(wxid, password, macId);
        String responseStr = contractParams.remoteConstruct(GZCXFW_HLW_WXCX_INFO_CS.getName(), wxcx);

        logger.info("gzcxfwHlwWxrzInfoCs: 出参- responseStr:{}", responseStr);
        return responseStr;
    }

    @Override
    public String gzcxfw_hlw_wxdj_Info_cs(String WXID, String password, String mac_id) {
        logger.info("gzcxfw_hlw_wxdj_Info_cs: 入参- WXID:{}, password:{}, mac_id:{}", WXID, password, mac_id);

        String wsdj = WebServiceMethodParamsUtils.createWxdjParams(WXID, password, mac_id);
        String responseStr = contractParams.remoteConstruct(GZCXFW_HLW_WXDJ_INFO_CS.getName(), wsdj);

        logger.info("gzcxfw_hlw_wxdj_Info_cs: 出参- responseStr:{}", responseStr);
        return responseStr;

    }

    @Override
    public String gzcxfw_hlw_wxzr_zx_Info_cs(String WXID, String password, String mac_id) {
        logger.info("gzcxfw_hlw_wxzr_zx_Info_cs: 入参- WXID:{}, password:{}, mac_id:{}", WXID, password, mac_id);

        String wsdj = WebServiceMethodParamsUtils.createWxzrParams(WXID, password, mac_id);
        String responseStr = contractParams.remoteConstruct(GZCXFW_HLW_WXZR_ZX_INFO_CS.getName(), wsdj);

        logger.info("gzcxfw_hlw_wxzr_zx_Info_cs: 出参- responseStr:{}", responseStr);
        return responseStr;
    }

    @Override
    public String gzcxfw_hlw_wjmm_Info_cs(String WXID, String SJH, String mac_id, String password) {
        logger.info("gzcxfw_hlw_wjmm_Info_cs: 入参- WXID:{}, SJH:{}, mac_id:{},password:{} ", WXID, SJH, mac_id, password);

        String wsdj = WebServiceMethodParamsUtils.createWjmmParams(WXID, SJH, mac_id, password);
        String responseStr = contractParams.remoteConstruct(GZCXFW_HLW_WJMM_INFO_CS.getName(), wsdj);

        logger.info("gzcxfw_hlw_wjmm_Info_cs: 出参- responseStr:{}", responseStr);
        return responseStr;
    }

    @Override
    public String gzcxfw_nw_wxcx_Info_cs(String Int_Xml) {
        logger.info("gzcxfw_nw_wxcx_Info_cs: 入参- Int_Xml:{}, SJH:{} ", Int_Xml);

        String wsdj = WebServiceMethodParamsUtils.createNwWxcxParams(Int_Xml);
        String responseStr = contractParams.remoteConstruct(GZCXFW_NW_WXCX_INFO_CS.getName(), wsdj);

        logger.info("gzcxfw_nw_wxcx_Info_cs: 出参- responseStr:{}", responseStr);
        return responseStr;
    }

}
