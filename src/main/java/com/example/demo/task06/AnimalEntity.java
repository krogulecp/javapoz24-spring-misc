package com.example.demo.task06;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AnimalEntity {
    private String name;
    private int age;

    @Id
    @GeneratedValue
    private long id;

    public AnimalEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public AnimalEntity() {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
