package com.yn.km.peter.enums;

public enum SignType {
    MD5("MD5"),
    RSA("RSA"),
    SHA1("SHA1");

    private String key;

    SignType(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
