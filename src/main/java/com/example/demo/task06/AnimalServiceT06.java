package com.example.demo.task06;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimalServiceT06 {

    private final AnimalRepository animalRepository;

    public AnimalServiceT06(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    public List<AnimalDTO> findAll() {
        return animalRepository.findAll().stream()
                .map(AnimalDTO::fromAnimal)
                .collect(Collectors.toList());
    }

    public Optional<AnimalDTO> findAnimal(long id) {
        return animalRepository.findById(id)
                .map(AnimalDTO::fromAnimal);
    }

    public void deleteAnimal(long id) {
        animalRepository.deleteById(id);
    }

    public void saveAnimals(List<AnimalEntity> animals) {
        animalRepository.saveAll(animals);
    }

    public List<AnimalDTO> top3Animals(){
        return animalRepository.findTop3ByOrderByNameDesc().stream()
                .map(AnimalDTO::fromAnimal)
                .collect(Collectors.toList());
    }
}
