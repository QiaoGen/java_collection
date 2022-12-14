package com.example.nativedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NativeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeDemoApplication.class, args);
    }

    @GetMapping("test")
    public String test(){
        return "Hello World";
    }
}
