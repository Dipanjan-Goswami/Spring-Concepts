package com.interview.concepts.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interview.concepts.service.SingletonService;

@RestController
public class ScopeController {
	
	@Autowired
	private SingletonService singleton;
	
	@GetMapping("/v1/scope")
	public List<String> getMethod() throws InterruptedException{
		String first = singleton.getMethod();
		Thread.sleep(1000);
		String second = singleton.getMethod();
		return Arrays.asList(first,second);
	}
}
