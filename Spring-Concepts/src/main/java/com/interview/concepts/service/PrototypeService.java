package com.interview.concepts.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PrototypeService {
	
	private String dateTime = LocalDateTime.now().toString();
	
	public String getMethod() {
		return dateTime;
	}
}
