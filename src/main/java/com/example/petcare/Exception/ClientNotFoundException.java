package com.example.petcare.Exception;

public class ClientNotFoundException extends RuntimeException {

	private String message;
	public ClientNotFoundException(String message){
		this.message=message;
	}
	
	public String getMessage() {
		return this.message;
	}

}
