package com.example.demo.task08;

import lombok.Value;

@Value
public class FilmDto {
    String title;
    Integer yearOfProduction;

    public static FilmDto fromFilm(FilmEntity filmEntity){
        return new FilmDto(filmEntity.getTitle(), filmEntity.getYearOfProduction());
    }
}
