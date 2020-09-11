//package com.example.demo.task07;
//
//import com.example.demo.task02.Animal;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class Task06Controller {
//    private final AnimalRepository animalRepository;
//
//    public Task06Controller(AnimalRepository animalRepository) {
//        this.animalRepository = animalRepository;
//    }
//
//    @PostMapping("/animals")
//    public void saveAnimal(@RequestBody Animal animal){
//        animalRepository.save(animal);
//    }
//
//    @GetMapping("/animals")
//    public List<Animal> getAnimals(@RequestParam int olderThen, @RequestParam String containsLetter){
//        return animalRepository.findAllByAgeGreaterThanAndNameContains(olderThen, containsLetter);
//    }
//}
