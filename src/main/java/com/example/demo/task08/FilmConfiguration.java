package com.example.demo.task08;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

import java.util.List;

@Configuration
public class FilmConfiguration {

    private final FilmRepository filmRepository;

    public FilmConfiguration(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void prepareFilmEntities() {
        filmRepository.saveAll(List.of(
                new FilmEntity(null, "Rambo", 1984),
                new FilmEntity(null, "Tenet", 2020),
                new FilmEntity(null, "The Green Mile", 1999),
                new FilmEntity(null, "The Godfather", 1972),
                new FilmEntity(null, "Forrest Gump", 1994),
                new FilmEntity(null, "Schindler's List", 1993),
                new FilmEntity(null, "Pulp Fiction ", 1994),
                new FilmEntity(null, "Se7en", 1995),
                new FilmEntity(null, "Fight Club", 1999)
        ));

        List<FilmEntity> films = filmRepository.findAll();
        System.out.println(films);
    }

}
