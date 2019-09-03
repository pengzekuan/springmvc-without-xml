package com.yn.km.peter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageTemplate {

    @Value("${pay_success}")
    private String paySuccess;

    @Value("${order_cancel}")
    private String orderCancel;

    @Value("${charge_back}")
    private String chargeBack;

    @Value("${register_success}")
    private String registerSuccess;

    @Value("${topup_success}")
    private String topupSuccess;

    public String getChargeBack() {
        return chargeBack;
    }

    public void setChargeBack(String chargeBack) {
        this.chargeBack = chargeBack;
    }

    public String getOrderCancel() {
        return orderCancel;
    }

    public void setOrderCancel(String orderCancel) {
        this.orderCancel = orderCancel;
    }

    public String getPaySuccess() {
        return paySuccess;
    }

    public void setPaySuccess(String paySuccess) {
        this.paySuccess = paySuccess;
    }

    public String getRegisterSuccess() {
        return registerSuccess;
    }

    public void setRegisterSuccess(String registerSuccess) {
        this.registerSuccess = registerSuccess;
    }

    public String getTopupSuccess() {
        return topupSuccess;
    }

    public void setTopupSuccess(String topupSuccess) {
        this.topupSuccess = topupSuccess;
    }
}
