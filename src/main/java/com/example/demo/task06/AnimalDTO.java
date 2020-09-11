package com.example.demo.task06;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AnimalDTO {

    String name;
    int age;

    public static AnimalDTO fromAnimal(AnimalEntity animal){
        return AnimalDTO.builder()
                .age(animal.getAge())
                .name(animal.getName())
                .build();
    }

}
