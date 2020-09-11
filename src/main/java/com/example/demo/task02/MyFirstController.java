package com.example.demo.task02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @GetMapping(path = "/hello")  //localhost:8080/hello
    public String message(){
        return "Hello World";
    }
}
