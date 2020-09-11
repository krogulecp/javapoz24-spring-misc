package com.example.demo.task05;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BeanNamesEndpoint {

    private final ConfigurableApplicationContext context;

    public BeanNamesEndpoint(ConfigurableApplicationContext context) {
        this.context = context;
    }

    @GetMapping(value = "/context", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<String> getBeanNames(){

        return List.of(context.getBeanDefinitionNames());
    }
}
