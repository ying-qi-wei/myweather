package com.hunau.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello ，黄娟 201841882325!";
    }
}
