package com.shopme.admin.restController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ShopmeAdmind")
public class MainController {

    @GetMapping("/get")
    public String viewHomePage() {
        System.out.println("hellooooooooooooooooooooo");
        return "Here is Admin backend page";

    }
}
