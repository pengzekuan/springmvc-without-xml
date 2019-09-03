package com.yn.km.peter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 转账商户配置
 */
@Component
public class Transfer {

    @Value("${transfer_mch_id}")
    private String mchId;

    @Value("${transfer_mch_name}")
    private String mchName;

    @Value("${transfer_mch_password}")
    private String mchKey;

    @Value("${transfer_pfx_path}")
    private String pfxPath;

    @Value("${transfer_pfx_password}")
    private String pfxPwd;

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getMchName() {
        return mchName;
    }

    public void setMchName(String mchName) {
        this.mchName = mchName;
    }

    public String getMchKey() {
        return mchKey;
    }

    public void setMchKey(String mchKey) {
        this.mchKey = mchKey;
    }

    public String getPfxPath() {
        return pfxPath;
    }

    public void setPfxPath(String pfxPath) {
        this.pfxPath = pfxPath;
    }

    public String getPfxPwd() {
        return pfxPwd;
    }

    public void setPfxPwd(String pfxPwd) {
        this.pfxPwd = pfxPwd;
    }
}
