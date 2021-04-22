package com.webtech.what2cook.controller;

import com.webtech.what2cook.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    TestService service;

    @RequestMapping("/answer")
    public String index(){
        return "The answer is "+service.computeSomething()+"";
    }

    @RequestMapping
    public String landingPage(){
        return "Welcome";
    }

    @RequestMapping("/hello")
    public String helloWorld(){
       return "hello world"
;    }

    @RequestMapping("/goeki")
    public String helloGoeki(){
        return "Hello Göki!";
    }

    @RequestMapping("/yannik")
    public String helloYannik(){
        return "Hello Yannik!";
    }




}
