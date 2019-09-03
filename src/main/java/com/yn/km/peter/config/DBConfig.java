package com.yn.km.peter.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:dbconfig.properties", encoding = "UTF-8")
public class DBConfig {

    @Value("${druid.url}")
    private String url;

    @Value("${druid.username}")
    private String userName;

    @Value("${druid.password}")
    private String password;

    public DBConfig() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
