package com.aws.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String test() {
        return "home page";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello to aws ElasticBean stalk";
    }
}
