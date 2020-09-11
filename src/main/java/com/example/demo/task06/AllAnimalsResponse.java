package com.example.demo.task06;

import lombok.Value;

import java.util.List;

@Value
public class AllAnimalsResponse {
    List<AnimalDTO> animals;
}
