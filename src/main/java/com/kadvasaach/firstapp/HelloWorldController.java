package com.kadvasaach.firstapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String HelloWorld() {
        return "Hello World! asda";
    }
}
