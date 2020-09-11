package com.example.demo.task02;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class Task02Controller {

    @GetMapping(value = "/task02", produces = MediaType.APPLICATION_JSON_VALUE)
    public Animal task02(){
        return new Animal("Cat", 1);
    }

    @GetMapping("/task02.3")
    public Animal task023(@RequestHeader Map<String,String> httpHeaders){
        return new Animal("Lion", 3);
    }

    @PostMapping("/task03")
    @ResponseStatus(HttpStatus.CREATED)
    public void task03(@RequestBody Animal animal) {
        System.out.println(animal.getName());
    }

    @PostMapping("/animal")
    public ResponseEntity<Animal> addAnimal(@RequestBody Animal animal){
        return ResponseEntity
                .accepted()
                .lastModified(Instant.now())
                .body(animal);
    }
}
