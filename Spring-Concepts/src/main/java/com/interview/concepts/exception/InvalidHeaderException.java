package com.interview.concepts.exception;

public class InvalidHeaderException extends Exception{
	private String message;

	public InvalidHeaderException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
