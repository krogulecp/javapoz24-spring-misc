package com.example.demo.task02;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;


@Validated
@RestController
public class FirstController {

    private final MyConverter myConverter;

    public FirstController(MyConverter converter){
        this.myConverter = converter;
    }

    @GetMapping(path = "/")
    public String hello(@RequestParam (value = "name", defaultValue = "World!") String name){
        return "Hello " + name;
    }

    @GetMapping(path = "/favourite/{num}")
    public String favourite(@PathVariable("num") String num,
                            @Size(min = 3, max = 20) @RequestParam(value = "name") String name){

        String prefix = "";
        if (!name.isEmpty()) {
            prefix = "Hello " + name;
        } else {
            prefix = "Hello";
        }

        return prefix + ", your favourite number is: " + num;
    }
}
