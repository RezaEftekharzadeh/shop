package com.shopme.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.shopme.admin.user")
public class ShopmebackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopmebackendApplication.class, args);
    }

}
