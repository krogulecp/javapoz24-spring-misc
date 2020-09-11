package com.example.demo.task04;

import com.example.demo.task02.Animal;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    public Animal get(){
        return new Animal("Panther", 2);
    }
}
