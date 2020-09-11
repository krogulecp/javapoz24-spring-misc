package com.example.demo.task08;

import lombok.Value;

import java.util.List;

@Value
public class FilmListResponse {
    List<FilmDto> films;
}
