package com.systemmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
// to generate the REST API documents for RESTful web services
@EnableSwagger2
@EnableEurekaClient




public class SystemManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemManagementApplication.class, args);
		System.out.println("Running");
	}

}
