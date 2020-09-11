package com.example.demo.task02;

import org.springframework.stereotype.Component;

@Component
public class AdvancedPropertiesCheck {

    private final AdvancedConfigurationProperties properties;

    public AdvancedPropertiesCheck(AdvancedConfigurationProperties properties) {
        this.properties = properties;
    }


}
