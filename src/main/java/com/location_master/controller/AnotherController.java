package com.location_master.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/another")
public class AnotherController {
    @GetMapping("/api")
    public  String getDetails(){
        return "Another Controller-20250527";
    }
}
