package com.yn.km.peter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "hello/index";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }
}
