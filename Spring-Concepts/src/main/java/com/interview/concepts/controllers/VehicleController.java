package com.interview.concepts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.concepts.Model.Vehicle;
import com.interview.concepts.registry.ServiceRegistry;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private ServiceRegistry serviceRegistry;
	
	@PostMapping
	public Vehicle processStudentDetails(@RequestBody Vehicle vehicle) {
		return (Vehicle) serviceRegistry.getService(vehicle.getVehicleType()).process(vehicle);
	}
}
