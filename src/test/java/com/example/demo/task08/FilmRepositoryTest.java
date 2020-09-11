package com.example.demo.task08;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class FilmRepositoryTest {

    @Autowired
    private FilmRepository filmRepository;

    @Test
    void shouldReturnFilmByTitle(){

        //given
        final String title = "Rambo";
        filmRepository.save(new FilmEntity(null, title, 1984));

        //when
        List<FilmEntity> films = filmRepository.findByTitle(title);

        //then
        assertEquals(1, films.size());
        assertEquals(title, films.get(0).getTitle());
    }
}
