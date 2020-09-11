package com.example.demo.task08;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/films")
    FilmListResponse getFilms(@RequestParam(value = "title", required = false) String title,
                              @RequestParam(value = "yop", required = false) Integer yop) {
        return new FilmListResponse(filmService.getFilms(title, yop));
    }

    @GetMapping("/filmsPaged")
    FilmListResponse getAllFilms(@RequestParam int pageNumber,
                                 @RequestParam int pageSize,
                                 @RequestParam Sort.Direction sorting){
        return new FilmListResponse(filmService.getFilmsPaged(pageNumber, pageSize, sorting));
    }
}
