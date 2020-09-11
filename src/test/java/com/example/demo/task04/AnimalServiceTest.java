package com.example.demo.task04;

import com.example.demo.task02.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnimalServiceTest {

    @Test
    void shouldReturnAnimal(){

        //when
        Animal animal = new AnimalService().get();

        //then
        Assertions.assertEquals("Panther", animal.getName());
    }

}
