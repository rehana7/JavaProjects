package com.example.SMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SMS.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{ 

	
}
