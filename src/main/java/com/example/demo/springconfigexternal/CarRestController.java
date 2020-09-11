package com.example.demo.springconfigexternal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("carRestControllerExternal")
public class CarRestController {

    private final CarService carService;
    private final String myCustomStringBean;
    private final String myPropsValue;
    private final CarProperties carProperties;

    public CarRestController(CarService carService,
                             @Qualifier("myCustomStringBean") String value,
                             @Value("${javapoz24.value}") String myPropsValue,
                             CarProperties carProperties) {
        this.carService = carService;
        this.myCustomStringBean = value;
        this.myPropsValue = myPropsValue;
        this.carProperties = carProperties;
    }

    @GetMapping("/cars2/{id}")
    public String getCar(@PathVariable int id){
        return carService.get(id);
    }
}
