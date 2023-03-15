package com.eazybytes.springsecuritybasic.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelCome {

    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to Spring Application with out Security";
    }
}
