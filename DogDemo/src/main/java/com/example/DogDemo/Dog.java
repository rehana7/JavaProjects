package com.example.DogDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope (value = "prototype")    // if we want singleton we want to assign as singleton.
public class Dog {
  private int id;
  private String name;
  private String breed; 
  @Autowired
  private Trainer trainer;
  
  public Dog() {
	  System.out.println("Dog object is created");
  }
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getBreed() {
	return breed;
}


public void setBreed(String breed) {
	this.breed = breed;
}


public Trainer getTrainer() {
	return trainer;
}
public void setTrainer(Trainer trainer) {
	this.trainer = trainer;
}
@Override
public String toString() {
	return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + ", trainer=" + trainer.getName()+ "]";
}

 
  
}
