package com.example.petcare.Exception;

public class AdminNotFoundException  extends RuntimeException{

	private String message;
	public AdminNotFoundException(String message){
		this.message=message;
	}
	
	public String getMessage() {
		return this.message;
	}

	

	}
