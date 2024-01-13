package com.spring.restaurant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/me")
public class DBController {

    @GetMapping("/getData")
    public String getData(){
        return "My Data";
    }
}
