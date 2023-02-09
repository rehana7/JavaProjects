package com.example.DMS.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table; 

@Entity 
@Table(name="dog")
public class Dog {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; 
	@Column(name ="name", nullable=false)
	private String name;
	@Column(name ="breed", nullable=false)
	private String breed;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	
}

