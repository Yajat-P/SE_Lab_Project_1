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
	
	
	

}

