package com.example.DMS.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DMS.Model.Dog;
import com.example.DMS.Service.DogService;

@Controller
public class DMSContoller {


	private DogService dogService;
	
	public DMSContoller(DogService dogService)
	{
			this.dogService = dogService;
     }
	
	@GetMapping("/dogs")
	public String listDogs(Model model) {
		model.addAttribute("dogs",dogService.getAllDogs());
		return "dogs";	
}  

	@GetMapping("/dogs/add")
	public String createDogForm(Model model) {
		Dog dog=new  Dog();
		model.addAttribute("dog", dog);
		return "add";
} 
	
	@GetMapping("/dogs/edit/{id}")
	public String editDogform(@PathVariable Long id, Model model) {
		model.addAttribute("dog", dogService.getDogById(id));
		return "edit";
} 
	
	@PostMapping("/dogs")
	public String saveDog(@ModelAttribute("dog") Dog dog) {
		dogService.saveDog(dog);
		return "redirect:/dogs";
	}
	@PostMapping("/dogs/{id}")
	public String updateDog(@PathVariable Long id, @ModelAttribute("dog") Dog dog, 
Model model) {
	
		Dog existingDog = dogService.getDogById(id);
		existingDog.setId(id);
		existingDog.setName(dog.getName());
		existingDog.setBreed(dog.getBreed());
		
	
		// save updated dog object
		dogService.updateDog(existingDog);
		return "redirect:/dogs";		
}

	@GetMapping("/dogs/{id}")
	public String deleteDog(@PathVariable Long id) {
			dogService.deleteDogById(id);
			return "redirect:/dogs";
	}

	
}
