package com.interview.concepts.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.interview.concepts.Model.Student;
import com.interview.concepts.service.APIService;

@RestController
@RequestMapping("/api/student")
public class APIController {
	
	private APIService apiService;
	
	@GetMapping
	public ResponseEntity<Student> fetchStudent(@RequestParam(name = "id") int StudentId,
				@RequestParam(name="isCacheable") boolean isCacheable) throws InterruptedException{
		return new ResponseEntity<Student>(apiService.fetchStudent(StudentId, isCacheable).get(), 
											HttpStatus.OK);
	}

}
