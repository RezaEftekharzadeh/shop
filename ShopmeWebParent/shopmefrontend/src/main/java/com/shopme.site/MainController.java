package com.shopme.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController  {
    private int test;

    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }
}



