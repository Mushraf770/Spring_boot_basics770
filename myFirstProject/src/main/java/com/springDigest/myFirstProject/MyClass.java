package com.springDigest.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("mdm")
    public String sayHello() {
        return "Hello";
    }
}
