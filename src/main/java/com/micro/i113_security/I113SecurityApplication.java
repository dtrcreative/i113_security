package com.micro.i113_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class I113SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(I113SecurityApplication.class, args);
	}

}
