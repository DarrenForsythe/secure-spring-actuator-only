package com.darrenforsythe.securespringactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureSpringActuatorOnlyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecureSpringActuatorOnlyApplication.class, args);
    }
}
