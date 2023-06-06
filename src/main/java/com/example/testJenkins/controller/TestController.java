package com.example.testJenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/home")
    public String home(){
        return "Hello World. This is Jenkins build.";
    }

    @GetMapping("/home2")
    public String home2(){
        return "Hi, this is my second commit";
    }

}
