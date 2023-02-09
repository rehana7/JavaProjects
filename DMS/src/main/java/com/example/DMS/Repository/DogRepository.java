package com.example.DMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DMS.Model.Dog;


public interface DogRepository extends JpaRepository<Dog, Long> {

}
