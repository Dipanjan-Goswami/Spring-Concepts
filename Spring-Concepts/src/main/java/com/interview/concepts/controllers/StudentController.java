package com.interview.concepts.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.StringUtils;
import com.interview.concepts.Model.Student;
import com.interview.concepts.exception.IllegalFieldException;

@RestController
@RequestMapping
public class StudentController {

	@PostMapping("/student")
	public String postStudentData(@RequestBody Student student) throws IllegalFieldException {
		if(StringUtils.isBlank(student.getLast_name())) {
			throw new IllegalFieldException("Field can not be empty");
		}
		return "Data Successfully saved";
	}
	
}
