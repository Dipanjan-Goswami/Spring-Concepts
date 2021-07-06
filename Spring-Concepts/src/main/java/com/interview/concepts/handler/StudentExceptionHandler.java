package com.interview.concepts.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.interview.concepts.exception.IllegalFieldException;
import com.interview.concepts.exception.InvalidHeaderException;

@ControllerAdvice
public class StudentExceptionHandler {
	
	@ExceptionHandler
	public String handleIllegalFieldException(IllegalFieldException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler
	public ResponseEntity<String> handleInvalidHeaderException(InvalidHeaderException ex) {
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.PRECONDITION_FAILED);
	}
}
