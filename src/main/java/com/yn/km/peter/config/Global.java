package com.yn.km.peter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 公共配置
 */
@Component
@PropertySource(value = "classpath:global.properties", encoding = "utf-8")
public class Global {

    @Value("${debug}")
    private boolean debug;

    @Value("${env}")
    private String env;

    @Value("${request_url}")
    private String domain;

    @Value("${order_range}")
    private int orderRange;

    @Value("${washer_wait_time}")
    private int receiveTime;

    @Value("#{'${contact_tel}'.split(',')}")
    private String[] contact;
    @Value("${request_timeout}")
    private int requestTimeout;
    @Value("${order_expires}")
    private int orderExpires;
    @Value("${cashcount}")
    private double cashcount;
    @Value("${fee}")
    private double fee;
    @Value("${days}")
    private int days;

    @Value("${file_upload_storage}")
    private String fileStorage;

    @Value("${file_upload_path}")
    private String filePath;

    public Global() {
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileStorage() {
        return fileStorage;
    }

    public void setFileStorage(String fileStorage) {
        this.fileStorage = fileStorage;
    }

    public int getOrderExpires() {
        return orderExpires;
    }

    public void setOrderExpires(int orderExpires) {
        this.orderExpires = orderExpires;
    }

    public int getRequestTimeout() {
        return requestTimeout;
    }

    public void setRequestTimeout(int requestTimeout) {
        this.requestTimeout = requestTimeout;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getOrderRange() {
        return orderRange;
    }

    public void setOrderRange(int orderRange) {
        this.orderRange = orderRange;
    }

    public int getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(int receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String[] getContact() {
        return this.contact;
    }

    public void setContact(String[] contact) {

        this.contact = contact;
    }

    public double getCashcount() {
        return cashcount;
    }

    public void setCashcount(double cashcount) {
        this.cashcount = cashcount;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public List<Map<String, String>> getContactAsList() {
        List<Map<String, String>> list = new ArrayList<>();
        for (String c : this.contact) {
            String[] tmp = c.split("\\|");
            Map<String, String> map = new HashMap<>();
            map.put("name", tmp[0]);
            map.put("value", tmp[1]);
            list.add(map);
        }
        return list;
    }

}
