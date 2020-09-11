package com.example.demo.task02;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Animal {

    private String name;
    private int age;

    @Id
//    @GenericGenerator(name = "my_custom_generator", strategy = "com.example.demo.task06.MyCustomUUIDGenerator")
//    @GeneratedValue(generator = "my_custom_generator")
    private UUID id;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
