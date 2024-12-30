package com.bilal.springSecuriy;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String helloWorld(HttpServletRequest request){
        return "HelloWorld" + request.getSession().getId();
    }
}
