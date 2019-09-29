package com.assignment.exception;

public class MainClass {

	public static void main(String[] args) {
		Validate details =new Validate("Devesh Bhardwaj", "abc@gmail.com", "password");
		
		try {
			details.validateDetails();
		} catch (InvalidPassword | InvalidEmail | InvalidUsername e) {
			e.printStackTrace();
		} finally {
			System.out.println("Final statement is always executed");
		}

	}

}
