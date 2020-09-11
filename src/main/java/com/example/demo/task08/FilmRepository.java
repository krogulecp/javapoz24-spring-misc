package com.example.demo.task08;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmRepository extends JpaRepository<FilmEntity, Long> {
    List<FilmEntity> findByTitle(String title);
    List<FilmEntity> findByYearOfProduction(int yearOfProduction);
    List<FilmEntity> findByTitleAndYearOfProduction(String title, Integer yearOfProduction);
}
