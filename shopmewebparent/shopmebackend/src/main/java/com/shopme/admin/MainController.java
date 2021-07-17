package com.shopme.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/ShopmeAdmind")
public class MainController {

    @GetMapping("")
    public String viewHomePage(){
        System.out.println("hellooooooooooooooooooooo");
        return "index";

    }
}
