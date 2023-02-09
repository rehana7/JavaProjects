package com.example.DMS.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.DMS.Model.Dog;
import com.example.DMS.Repository.DogRepository;
import com.example.DMS.Service.DogService;

@Service
public class DogServiceImpl implements DogService{

//	public class DogServiceImpl implements DogService{

		private DogRepository dogRepository;

		public DogServiceImpl(DogRepository dogRepository) {
			this.dogRepository = dogRepository;
	}

		@Override
		public List<Dog> getAllDogs()
		{
				return dogRepository.findAll();
		}
		  
				@Override
			public Dog saveDog(Dog dog)
			{
				return dogRepository.save(dog);
			}

			public Dog getDogById(Long id)
			{
				return dogRepository.findById(id).get();
			}

			public Dog updateDog(Dog dog)
			{
				return dogRepository.save(dog);
			}

			public void deleteDogById(Long id)
			{
				dogRepository.deleteById(id);
			}


	

}

