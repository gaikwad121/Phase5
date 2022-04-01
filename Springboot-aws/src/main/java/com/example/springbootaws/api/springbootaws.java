package com.example.springbootaws.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class springbootaws {

	@GetMapping("/")
	
	public String home(){
		return "Hello! Welcome to SpringBoot deployment with Aws";
	}
	public static void main(String[] args) {
		SpringApplication.run(springbootaws.class, args);
	}

}
