package com.example.demo.task06;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Task06ControllerTest {

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void shouldReturnAnimal(){
        //when
        animalRepository.save(new AnimalEntity("Lion", 2));

        //when
        ResponseEntity<AnimalDTO> animalEntity = testRestTemplate.getForEntity("/animal/1", AnimalDTO.class);

        //then
        assertEquals(HttpStatus.OK, animalEntity.getStatusCode());
    }


}
