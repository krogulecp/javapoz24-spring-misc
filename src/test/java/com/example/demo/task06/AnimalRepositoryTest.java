package com.example.demo.task06;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class AnimalRepositoryTest {

    @Autowired
    private AnimalRepository animalRepository;

    @Test
    void shouldFindAnimals(){
        animalRepository.save(new AnimalEntity("Dog", 6));

        List<AnimalEntity> animals = animalRepository.findAll();

        assertEquals(1, animals.size());
    }
}
