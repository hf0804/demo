package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller
public class App 
{
    @ResponseBody
    @RequestMapping("/test/v1/rest")
    public String hello(String json) {
        System.out.println("你所提交的数据：");
        System.out.println(json);
        return "你所提交的数据："+json;
    }


}
