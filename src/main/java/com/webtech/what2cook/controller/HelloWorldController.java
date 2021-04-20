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

<<<<<<< HEAD
=======
    @RequestMapping("/goeki")
    public String helloGoeki(){
        return "Hello Göki!";
    }

    @RequestMapping("/yannik")
    public String helloYannik(){
        return "Hello Yannik!";
    }
>>>>>>> 5c33be21c9e3d04cb3e266de1ef48e76f9214a5a

}
