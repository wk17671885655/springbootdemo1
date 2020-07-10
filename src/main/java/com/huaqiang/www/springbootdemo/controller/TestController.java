package com.huaqiang.www.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/getHW")
    @ResponseBody
    public String getHW(){
        return "helloWord";
    }
}
