package com.yn.km.peter.helper;

import com.yn.km.peter.enums.SignType;
import org.apache.http.NameValuePair;
import org.springframework.web.util.UriComponentsBuilder;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.*;

public class StringHelper {

    public static String transNo(long uid, int type) {
        Date date = new Date();
        return type
                + DateHelper.format(date, "yyMMdd")
                + padLeft(Long.toHexString(uid), '0', 8)
                + random(2);
    }

    public static int random(int len) {
        int start = len == 1 ? 0 : (int) Math.pow(10, len - 1);
        return new Random().nextInt((int) Math.pow(10, len)) + start;
    }

    public static String padLeft(String str, char ch, int len) {
        String res = "";
        for (int i = 0; i < len - str.length(); i++) {
            res += ch;
        }
        return res + str;
    }

    public static String escape(String str) {
        return str
                .replaceAll("'", "\\\\\'"); // 单引号转义
    }

    public static String getTimestampStr() {

        return String.valueOf(System.currentTimeMillis() / 1000);
    }

    public static String getNonceStr() {

        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String encrypt(SignType encryptType, String string) {

        try {

            MessageDigest messageDigest = MessageDigest.getInstance(encryptType.getKey());

            messageDigest.update(string.getBytes(Charset.defaultCharset().name()));

            byte[] bytes = messageDigest.digest();

            StringBuffer hexBuffer = new StringBuffer();
            for (byte b : bytes) {
                if ((b & 0xff) < 0x10) {
                    hexBuffer.append(0);
                }
                hexBuffer.append(Integer.toHexString(b & 0xff));
            }

            return hexBuffer.toString().toUpperCase(Locale.CHINESE);
        } catch (Exception e) {

            e.printStackTrace();
        }

        return "";
    }

    public static String queryBuilder(String url, List<NameValuePair> query) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

        if (query.size() > 0) {
            query.forEach(q -> builder.queryParam(q.getName(), q.getValue()));
            url = builder.build().encode().toUriString();
        }
        return url;
    }


}
