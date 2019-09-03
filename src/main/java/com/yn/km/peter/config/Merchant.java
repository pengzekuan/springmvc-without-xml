package com.yn.km.peter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 支付商户号配置
 */
@Component
public class Merchant {

    /**
     * 交易商户号
     */
    @Value("${tl_mch_id}")
    private String mchId;

    /**
     * 平台分配appid
     */
    @Value("${tl_mch_app_id}")
    private String appId;

    @Value("${tl_mch_app_key}")
    private String appKey;

    @Value("${payment_notify_uri}")
    private String notifyUri;

    private String version;

    @Value("${order_expires}")
    private int validTime;
    /**
     * 支付限制 暂时只对微信支付和支付宝有效,仅支持no_credit
     */
    private String limitPay;

    private String apiPath;

    private String apiPayment;

    private String apiCancel;

    private String apiRefund;

    private String apiQuery;

    public Merchant() {
        this.version = "11";
        this.apiPath = "https://vsp.allinpay.com/apiweb/unitorder/";
        this.apiPayment = this.apiPath + "pay";
        this.apiCancel = this.apiPath + "cancel";
        this.apiRefund = this.apiPath + "refund";
        this.apiQuery = this.apiPath + "query";
    }

    public String getApiQuery() {
        return apiQuery;
    }

    public void setApiQuery(String apiQuery) {
        this.apiQuery = apiQuery;
    }

    public String getApiCancel() {
        return apiCancel;
    }

    public void setApiCancel(String apiCancel) {
        this.apiCancel = apiCancel;
    }

    public String getApiPayment() {
        return apiPayment;
    }

    public void setApiPayment(String apiPayment) {
        this.apiPayment = apiPayment;
    }

    public String getApiRefund() {
        return apiRefund;
    }

    public void setApiRefund(String apiRefund) {
        this.apiRefund = apiRefund;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getValidTime() {
        return validTime;
    }

    public void setValidTime(int validTime) {
        this.validTime = validTime;
    }

    public String getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }

    public String getNotifyUri() {
        return notifyUri;
    }

    public void setNotifyUri(String notifyUri) {
        this.notifyUri = notifyUri;
    }

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
}
