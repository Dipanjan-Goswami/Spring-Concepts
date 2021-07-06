package com.interview.concepts.service;

import org.springframework.stereotype.Service;

import com.interview.concepts.Model.Vehicle;
import com.interview.concepts.registry.AdapterService;

@Service(value = "Truck")
public class TruckService implements AdapterService<Vehicle> {

	/*@Override
	public Vehicle process(Vehicle request) {
		System.out.println("Inside Truck Service ---> " + request.toString());
	}*/

	@Override
	public Vehicle process(Vehicle request) {
		return request;
	}
}
