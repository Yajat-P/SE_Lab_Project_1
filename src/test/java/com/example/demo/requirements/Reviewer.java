package com.example.demo.requirements;

import java.time.LocalDate;

public class Reviewer {
	private Long id;
	private String name;
	private LocalDate dob;
	private String email;
	
	
	public Reviewer()
	{
		
	}


	public Reviewer(Long id, 
			String name, 
			LocalDate dob, 
			String email) {
		
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
	}


	public Reviewer(String name, 
			LocalDate dob, 
			String email) {
		
		this.name = name;
		this.dob = dob;
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}

