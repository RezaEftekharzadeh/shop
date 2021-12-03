package com.shopme.admin.user.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/api/admin")
public class AdminRestController {

    @GetMapping("/test")
    public String testAdminService(){
        return "Test Admin Service Is Working!";
    }
}
