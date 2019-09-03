package com.yn.km.peter.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 客户端拦截器
 */
public class CustomerRequestInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // get request path
        System.out.println("请求地址：" + request.getScheme() + "://" + request.getServerName());
        System.out.println("访问域名：" + request.getServerName());
        System.out.println("客户端IP：" + request.getLocalAddr());
        System.out.println("请求协议：" + request.getProtocol());
        System.out.println("请求协议：" + request.getScheme());
        String urlPath = request.getServletPath();
        System.out.println("Request url: " + urlPath);

        return true;
    }
}
