package com.interview.concepts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.interview.concepts.registry.ServiceRegistry;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;

@Configuration
public class VehicleConfig {
	
	@Bean
	public FactoryBean<?> FactoryBean(){
		final ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
		bean.setServiceLocatorInterface(ServiceRegistry.class);
		return bean;
	}

}
