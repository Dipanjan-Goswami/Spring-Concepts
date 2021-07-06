package com.interview.concepts.exception;

public class IllegalFieldException extends Exception{
	private String message;

	public IllegalFieldException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
