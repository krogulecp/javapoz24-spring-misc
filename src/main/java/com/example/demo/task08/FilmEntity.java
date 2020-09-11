package com.example.demo.task08;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilmEntity {

    @Id
    @GeneratedValue
    private UUID id;
    private String title;
    private Integer yearOfProduction;
}
