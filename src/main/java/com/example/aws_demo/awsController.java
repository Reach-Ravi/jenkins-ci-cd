package com.example.aws_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class awsController {
    @RequestMapping("/healthcheck")
    String hello() {
        return "Welcome to the new Learning, AWS !";
    }
}
