package com.assignment.exception;

public class Validate {
	String username;
	String email;
	String password;
	
	public Validate(String username,String email, String password) {
		this.username= username;
		this.email= email;
		this.password =password;
	}
	
	public void validateDetails() throws InvalidPassword,InvalidEmail,InvalidUsername {
		if(password.length()<6||password.isEmpty()) {
			throw new InvalidPassword("Invalid Password!");
		}
		if(!email.contains("@")||email.isEmpty()) {
			throw new InvalidEmail("Invalid Email Address!");
		}
		if(username.contains(" ")||username.isEmpty()) {
			throw new InvalidUsername("Invalid Username");
		}
		
	}
	
}
