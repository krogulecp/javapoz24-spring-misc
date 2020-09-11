package com.example.demo.springconfig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CarRestController {

    private final CarService carService;

    public CarRestController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/{id}")
    public String getCar(@PathVariable int id){
        return carService.get(id);
    }
}
