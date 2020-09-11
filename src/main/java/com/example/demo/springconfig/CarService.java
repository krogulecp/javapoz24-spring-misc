package com.example.demo.springconfig;

import org.springframework.stereotype.Service;

@Service
class CarService {

    private final CarRepository carRepository;
    private final CarValidator carValidator;

    public CarService(CarRepository carRepository, CarValidator carValidator) {
        this.carRepository = carRepository;
        this.carValidator = carValidator;
    }

    public String get(int id) {
        if (carValidator.valid()){
            return carRepository.findById(id);
        } else {
            throw new RuntimeException("Car is not valid");
        }
    }
}
