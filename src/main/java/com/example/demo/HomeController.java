package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/teacher")
    public String index(){
        return "login";
    }
    @RequestMapping("/student")
    public String login(){
        return "student";
    }
    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }
}
