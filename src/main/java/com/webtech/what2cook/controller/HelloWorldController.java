package com.webtech.what2cook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String landingPage(){
        return "Welcome";
    }

    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello World!";
    }


}
