package com.shopme.admin.mainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ShopmeAdmin")
public class MainController {

    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }
}
