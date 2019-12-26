package com.test.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @RequestMapping("/user")
    public String index(){
        return "Congratulations.... You're First Spring Boot Application is Ready to Use...!";
    }
}
