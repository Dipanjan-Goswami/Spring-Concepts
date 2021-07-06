package com.interview.concepts.service;

import org.springframework.stereotype.Service;

import com.interview.concepts.Model.Vehicle;
import com.interview.concepts.registry.AdapterService;

@Service(value = "Bike")
public class BikeService implements AdapterService<Vehicle>{
	
	/*@Override
	public void process(Vehicle request) {
		System.out.println("Inside Bike Service ---> " + request.toString());
	}*/
	
	@Override
	public Vehicle process(Vehicle request) {
		return request;
	}
}	
