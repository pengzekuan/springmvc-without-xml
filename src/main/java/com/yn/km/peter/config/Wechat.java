package com.yn.km.peter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 公众号配置
 */
@Component
public class Wechat {

    @Value("${app_id}")
    private String appId;

    @Value("${app_secret}")
    private String appSecret;

    public Wechat() {
    }

    public String getAppId() {
        return appId;
    }

    @Deprecated
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    @Deprecated
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
}
