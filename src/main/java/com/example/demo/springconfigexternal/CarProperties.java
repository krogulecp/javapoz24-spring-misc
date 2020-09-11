package com.example.demo.springconfigexternal;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.HashMap;
import java.util.Map;

@Data
@ConfigurationProperties(prefix = "pl.sdacademy")
public class CarProperties {
    private String title;
    private Map<String,String> cars = new HashMap<>();
}
