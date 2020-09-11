package com.example.demo.task06;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class Task06Controller {
    private final AnimalServiceT06 animalService;

    public Task06Controller(AnimalServiceT06 animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/animals")
    public AllAnimalsResponse getAllAnimals(){
        return new AllAnimalsResponse(animalService.top3Animals());
    }

    @DeleteMapping("/animals/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable(value = "id") long id) {
        try {
            animalService.deleteAnimal(id);
        } catch (EmptyResultDataAccessException exception) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/animal/{id}")
    public ResponseEntity<AnimalDTO> getAnimal(@PathVariable(value = "id") long id) {
        Optional<AnimalDTO> animal = animalService.findAnimal(id);
        return animal
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/animals")
    public void addManyAnimals(@RequestBody List<AnimalEntity> animals){
        animalService.saveAnimals(animals);
    }

}
