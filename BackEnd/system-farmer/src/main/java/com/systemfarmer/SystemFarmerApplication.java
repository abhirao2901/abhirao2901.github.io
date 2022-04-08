package com.systemfarmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//used to mark a configuration class that declares one or more @Bean
// methods and also triggers auto-configuration and component scanning
@EnableSwagger2
//to generate the REST API documents for RESTful web services
@EnableEurekaClient
// makes your Spring Boot application act as a Eureka client
public class SystemFarmerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SystemFarmerApplication.class, args);
		System.out.println("System - Farmer running......................");
	}

}
