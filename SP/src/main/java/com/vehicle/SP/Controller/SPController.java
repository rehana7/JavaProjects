package com.vehicle.SP.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.vehicle.SP.Service.ParkingService;
@Controller
public class SPController {

//	private ParkingService parkingService;
	
//	public SPController(ParkingService parkingService)
//	{
////			this.parkingService = parkingService;
//     }
//	
	@GetMapping("/parking")
	public String listParkings(Model model) {
	//	model.addAttribute("parkings",parkingService.getAllParkings());
		return "parkings";	
}  
/*s
	@GetMapping("/students/add")
	public String createStudentForm(Model model) {
		Student student=new  Student();
		model.addAttribute("student", student);
		return "add";
} 
	
	@GetMapping("/students/edit/{id}")
	public String editStudentform(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit";
} 
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, 
Model model) {
	
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setProgramName(student.getProgramName());
		existingStudent.setEmail(student.getEmail());
	
		// save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/students";		
}

	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
			studentService.deleteStudentById(id);
			return "redirect:/students";
	}
*/
	
}
