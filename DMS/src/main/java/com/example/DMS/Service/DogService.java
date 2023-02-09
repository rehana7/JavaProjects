package com.example.DMS.Service;

import java.util.List;

import com.example.DMS.Model.Dog;



public interface DogService {

	public List<Dog> getAllDogs();  
	public Dog saveDog(Dog student);
	public Dog getDogById(Long id);
	public Dog updateDog(Dog student);
	public void deleteDogById(Long id);
}
