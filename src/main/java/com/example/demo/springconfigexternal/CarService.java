package com.example.demo.springconfigexternal;

public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public String get(int id) {
        return carRepository.findById(id);
    }
}
