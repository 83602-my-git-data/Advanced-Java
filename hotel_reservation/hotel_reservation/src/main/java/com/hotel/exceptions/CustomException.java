package com.hotel.exceptions;

public class CustomException extends RuntimeException{
	private String message;

	public CustomException(String message) {
		super();
		this.message = message;
	}
	
}
