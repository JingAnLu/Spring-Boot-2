package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody //告知浏览器这个类中的方法，返回的字符串都是要浏览器直接显示出来的
@RestController //这个就是 @Controller 和 @ResponseBody 的合体形式，功能是一样的
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {
        return "hello, Spring Boot 2!";
    }
}
