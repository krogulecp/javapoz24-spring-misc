package com.example.demo.configproperties;

import com.example.demo.task06.AnimalRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
public class CarConfiguration {

    @Bean
    public String myCarBean(AnimalRepository animalRepository, List<CarService> carService){
        return "myCar";
    }

}


interface CarService {}

@Component
class CarServiceImpl1 implements CarService {

}

@Component
class CarServiceImpl2 implements CarService {

}
