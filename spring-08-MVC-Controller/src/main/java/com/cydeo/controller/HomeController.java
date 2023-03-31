package com.cydeo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home.html";
    }

    @RequestMapping // works at homepage
    public String home1(){
        return "home.html";
    }
    @RequestMapping ({"/apple","/orange"}) //multiple endpoints
    public String home2(){
        return "home.html";
    }



}
