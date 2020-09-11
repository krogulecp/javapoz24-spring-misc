package com.example.demo.task08;

import com.example.demo.task06.AnimalEntity;
import com.example.demo.task06.AnimalRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FilmRepositoryRestAssured {

    @LocalServerPort
    private int port;

    @Autowired
    private AnimalRepository animalRepository;

    @Test
    void shouldReturnFilmByTitle(){

        animalRepository.save(new AnimalEntity("Lion", 2));

        given()
                .port(port)
        .when()
                .get("/zoo/animal/1")
                .andReturn()
        .then()
                .assertThat()
                .statusCode(200)
                .body("name", is("Lion"));
    }

}
