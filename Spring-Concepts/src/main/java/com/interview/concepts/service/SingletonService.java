package com.interview.concepts.service;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SingletonService {
	
	//@Autowired
	//private PrototypeService prototype;
	
	@Autowired
	private ApplicationContext context;
	
	//@Autowired
	//private Provider<PrototypeService> prototypeObjectFactory;
	
	@Autowired
	private ObjectFactory<PrototypeService> prototypeObjectFactory;
	
	public String getMethod() {
		//return context.getBean(PrototypeService.class).getMethod();
		//return prototype.getMethod();
		//return prototypeService().getMethod();
		//getServiceProvider.get().getMethod();
		return prototypeObjectFactory.getObject().getMethod();
	}
	
	@Lookup
	private PrototypeService prototypeService() {
		return null;
	}
}
