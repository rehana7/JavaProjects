package com.example.SMS.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="students")
public class Student { 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; 
	@Column(name ="first_name", nullable=false)
	private String firstName;
	@Column(name ="lastName", nullable=false)
	private String lastName;
	@Column(name ="programName", nullable=false)
	private String programName;
	@Column(name ="email", nullable=false)
	private String email;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	} 
	
	
	
}
