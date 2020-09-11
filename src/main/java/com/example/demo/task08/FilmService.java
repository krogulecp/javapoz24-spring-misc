package com.example.demo.task08;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<FilmDto> getFilms(String title, Integer yop) {
        return filmRepository.findByTitleAndYearOfProduction(title, yop).stream()
                .map(FilmDto::fromFilm)
                .collect(Collectors.toList());
    }

    public List<FilmDto> getFilmsPaged(int pageNumber, int pageSize, Sort.Direction sorting) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, sorting, "title");
        return filmRepository.findAll(pageRequest).stream()
                .map(FilmDto::fromFilm)
                .collect(Collectors.toList());
    }
}
