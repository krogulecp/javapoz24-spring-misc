package com.example.demo.springconfigexternal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarsConfiguration {

    @Bean
    public CarService carServiceExternal(CarRepository inMemoryCarRepositoryExternal){
        return new CarService(inMemoryCarRepositoryExternal);
    }

    @Bean
    public CarRepository inMemoryCarRepositoryExternal(){
        return new CarInMemoryRepository();
    }

    @Bean
    public String myCustomStringBean(){
        return "my custom bean";
    }

    @Bean
    public String myCustomStringBean2(){
        return "my custom bean 2";
    }
}
