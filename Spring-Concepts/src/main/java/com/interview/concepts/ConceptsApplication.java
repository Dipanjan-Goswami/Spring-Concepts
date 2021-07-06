package com.interview.concepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConceptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConceptsApplication.class, args);
	}

}
