package com.interview.concepts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.concepts.property.ComplexProperty;
import com.interview.concepts.property.Property;

@RestController
@RequestMapping("/property")
public class ConfigurationPropertyController {
	
	@Value("${config.property.value}")
	private String springProperty;
	
	//@Autowired
	//private Property property;
	
	@GetMapping
	public String getPropertyFromConfiguration() {
		return String.format("Value obtained from application.yml file is --> %s", springProperty);
	}
	
	/*@GetMapping("/v1")
	public List<String> getConfProperty(){
		List<String> ConfPropertyValues =  new ArrayList<>();
		ConfPropertyValues.add(String.valueOf(property.getStudentCapacity()));
		ConfPropertyValues.add(property.getSchoolName());
		return ConfPropertyValues;
	}*/
	
	@Autowired
	private ComplexProperty complexProperty;
	
	@GetMapping("/v2")
	public List<Property> getProperties(){
		return complexProperty.getListOfProperty();
	}
	
}
