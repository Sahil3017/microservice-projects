package com.example.demo_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// component scan
@RestController
public class CheckController {
    @GetMapping("/check")
    public String getMethod() {
        return new String("Check");

    }

    @PostMapping("/add-data")

    public String postMethodName(@RequestParam String name) {

        return name;
    }
}
