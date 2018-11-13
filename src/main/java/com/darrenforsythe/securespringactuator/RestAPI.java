package com.darrenforsythe.securespringactuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }
}
