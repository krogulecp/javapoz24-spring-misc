package com.example.demo.task06;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@RepositoryRestResource(collectionResourceRel = "animals-repo", path = "animal-repo")
public interface AnimalRepository extends JpaRepository<AnimalEntity, Long> {

    List<AnimalEntity> findByName(String name);
    List<AnimalEntity> findByAge(int age);
    List<AnimalEntity> findByNameAndAge(String name, int age);

    List<AnimalEntity> findTop3ByOrderByNameDesc();
}
