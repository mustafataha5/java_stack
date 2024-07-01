package com.mydomain.authentication.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class LoginUser {

	
	@NotEmpty(message = "Email is required.")
	@Email(message = "Please ,enter valid Email address.")
	private String email;
	
	@NotEmpty(message ="Password is required" )
	@Size(min=8,max=128,message = "Password must be between 8-128 characters.")
	private String password ; 
	
	public LoginUser() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
