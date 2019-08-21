package com.ponnalearn.springfullstackreact.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue
	public Long id;
	
	@Column(name="first_name")
	public String firstName;
	@Column(name="last_name")
	public String lastName;
	@Column(name="email")
	public String email;
	
	
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Contact(String firstName, String lastName, String email) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email=email;
	}
	
/*
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	*/
	

}
