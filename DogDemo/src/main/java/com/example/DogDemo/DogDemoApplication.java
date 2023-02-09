package com.example.DogDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DogDemoApplication {

	public static void main(String[] args) { 
		
		ConfigurableApplicationContext appContext =
		SpringApplication.run(DogDemoApplication.class, args); 
		
		Dog dogOne = appContext.getBean(Dog.class); 
		System.out.println(dogOne);
		dogOne.setId(12);
		dogOne.setName("Puppy");
		dogOne.setBreed("GermanShepard");
		dogOne.getTrainer().setName("John");
		Dog dogTwo = appContext.getBean(Dog.class);
		dogOne.getTrainer().setName("Rod");
		
	//	Dog dogTwo = appContext.getBean(Dog.class); 
		dogOne.getTrainer().setName("Rod");
		System.out.println(dogOne);
		System.out.println(dogTwo);
		
	}

}
