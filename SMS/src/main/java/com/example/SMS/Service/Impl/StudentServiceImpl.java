package com.example.SMS.Service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SMS.Model.Student;
import com.example.SMS.Repository.StudentRepository;
import com.example.SMS.Service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
}

	@Override
	public List<Student> getAllStudents()
	{
			return studentRepository.findAll();
	}
	  
			@Override
		public Student saveStudent(Student student)
		{
			return studentRepository.save(student);
		}

		public Student getStudentById(Long id)
		{
			return studentRepository.findById(id).get();
		}

		public Student updateStudent(Student student)
		{
			return studentRepository.save(student);
		}

		public void deleteStudentById(Long id)
		{
			studentRepository.deleteById(id);
		}


}
