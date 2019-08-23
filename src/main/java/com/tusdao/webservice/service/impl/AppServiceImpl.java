package com.tusdao.webservice.service.impl;

import com.tusdao.base.configuration.SpringUtil;
import com.tusdao.webservice.service.AppService;
import com.tusdao.webservice.utils.AppMethodParamsUtils;
import com.tusdao.webservice.utils.BdcgzcxfwMethodParamsUtils;
import com.tusdao.webservice.utils.ContractUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.tusdao.webservice.enums.WsInterfaceName.*;

/**
 * @author yueli
 * @date 2019-08-17 15:46
 */
public class AppServiceImpl implements AppService {

    private static Logger logger = LoggerFactory.getLogger(AppServiceImpl.class);

    ContractUtils contractParams = SpringUtil.getBean(ContractUtils.class);

    @Override
    public String appcxjk_hlw_apprz_Info_cs(String APPID, String XM, String SFZH, String SJH, String mac_id,
                                            String password) {
        logger.info("appcxjk_hlw_apprz_Info_cs: 入参- APPID:{}, XM:{}, SFZH:{}, SJH:{}, mac_id:{}, password:{}", APPID,
                XM, SFZH, SJH, mac_id, password);

        String wsdj = AppMethodParamsUtils.createApprzParams(APPID, XM, SFZH, SJH, mac_id, password);
        String responseStr = contractParams.remoteConstruct(APPCXJK_HLW_APPRZ_INFO_CS.getName(), wsdj);

        logger.info("appcxjk_hlw_apprz_Info_cs: 出参- responseStr:{}", responseStr);
        return responseStr;

    }

    @Override
    public String appcxjk_hlw_apprzzx_Info_cs(String APPID, String XM, String SFZH, String SJH, String mac_id,
                                              String password) {
        logger.info("appcxjk_hlw_apprzzx_Info_cs: 入参- APPID:{}, XM:{}, SFZH:{},SJH:{}, mac_id:{}, password:{}", APPID
                , XM, SFZH, SJH, mac_id, password);

        String wsdj = AppMethodParamsUtils.createApprzzxParams(APPID, XM, SFZH, SJH, mac_id, password);
        String responseStr = contractParams.remoteConstruct(APPCXJK_HLW_APPRZZX_INFO_CS.getName(), wsdj);

        logger.info("appcxjk_hlw_apprzzx_Info_cs: 出参- responseStr:{}", responseStr);
        return responseStr;
    }

    @Override
    public String appcxjk_hlw_apprzcx_Info_cs(String APPID, String SJH, String mac_id, String password) {
        logger.info("appcxjk_hlw_apprzcx_Info_cs: 入参- APPID:{}, SJH:{}, mac_id:{}, password:{}", APPID, SJH, mac_id,
                password);

        String wsdj = AppMethodParamsUtils.createApprzcxParams(APPID, SJH, mac_id, password);
        String responseStr = contractParams.remoteConstruct(APPCXJK_HLW_APPRZCX_INFO_CS.getName(), wsdj);

        logger.info("appcxjk_hlw_apprzcx_Info_cs: 出参- responseStr:{}", responseStr);
        return responseStr;
    }

    @Override
    public String appcxjk_hlw_appfwcx_Info_cs(String APPID, String SJH, String mac_id, String password) {
        logger.info("appcxjk_hlw_appfwcx_Info_cs: 入参- APPID:{}, SJH:{}, mac_id:{}, password:{}", APPID, SJH, mac_id,
                password);

        String wsdj = AppMethodParamsUtils.createAppfwcxParams(APPID, SJH, mac_id, password);
        String responseStr = contractParams.remoteConstruct(APPCXJK_HLW_APPFWCX_INFO_CS.getName(), wsdj);

        logger.info("appcxjk_hlw_appfwcx_Info_cs: 出参- responseStr:{}", responseStr);
        return responseStr;
    }

    @Override
    public String appcxjk_hlw_appjycx_Info_cs(String APPID, String SJH, String mac_id, String password) {
        logger.info("appcxjk_hlw_appjycx_Info_cs: 入参- APPID:{}, SJH:{}, mac_id:{}, password:{}", APPID, SJH, mac_id,
                password);

        String wsdj = AppMethodParamsUtils.createAppjycxParams(APPID, SJH, mac_id, password);
        String responseStr = contractParams.remoteConstruct(APPCXJK_HLW_APPJYCX_INFO_CS.getName(), wsdj);

        logger.info("appcxjk_hlw_appjycx_Info_cs: 出参- responseStr:{}", responseStr);
        return responseStr;
    }

    @Override
    public String appcxjk_hlw_appwscx_Info_cs(String APPID, String SJH, String HTBH, String mac_id, String password) {
        logger.info("appcxjk_hlw_appwscx_Info_cs: 入参- APPID:{}, SJH:{}, HTBH:{}, mac_id:{}, password:{}", APPID, SJH,
                HTBH, mac_id, password);

        String wsdj = AppMethodParamsUtils.createAppwscxParams(APPID, SJH, HTBH, mac_id, password);
        String responseStr = contractParams.remoteConstruct(APPCXJK_HLW_APPWSCX_INFO_CS.getName(), wsdj);

        logger.info("appcxjk_hlw_appwscx_Info_cs: 出参- responseStr:{}", responseStr);
        return responseStr;
    }

    @Override
    public String appcxjk_hlw_appzsyz_Info_cs(String APPID, String SJH, String QRCODE, String mac_id, String password) {
        logger.info("appcxjk_hlw_appzsyz_Info_cs: 入参- APPID:{}, SJH:{}, QRCODE:{}, mac_id:{}, password:{}", APPID,
                SJH, QRCODE, mac_id, password);

        String wsdj = AppMethodParamsUtils.createHlwParams(APPID, SJH, QRCODE, mac_id, password);
        String responseStr = contractParams.remoteConstruct(APPCXJK_HLW_APPZSYZ_INFO_CS.getName(), wsdj);

        logger.info("appcxjk_hlw_appzsyz_Info_cs: 出参- responseStr:{}", responseStr);
        return responseStr;
    }
}
