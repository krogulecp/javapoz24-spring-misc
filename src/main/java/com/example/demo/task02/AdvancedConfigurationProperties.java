package com.example.demo.task02;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@ConfigurationProperties(prefix = "advanced")
public class AdvancedConfigurationProperties {

    private String title = "myDefaultValue";
    private Map<String, Animal> animals = new HashMap<>();
    private List<String> names = Collections.emptyList();

    @NestedConfigurationProperty
    private Map<String, Map<String, CourseDetails>> countries = new HashMap<>();
}

@Data
class CourseDetails {
    private BigDecimal price;
    private Level level;
}

enum Level {
    BEGINNER, INTERMEDIATE, ADVANCED, EXPERT
}
