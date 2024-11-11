package com.bilal.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")

    public String greet (){
        return "Welcome to Homepage";
    }

    @RequestMapping("about")
    public String about (){
        return "this is aboutpage";
    }
}