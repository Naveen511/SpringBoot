package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// To indicate the configuration, 
// to this class will be processing the spring container
// To generate been generation
@Configuration
// Enable auto configuration of the spring context and class to configure 
// automatically based on its test case
@EnableAutoConfiguration
// Provides components calling director
@ComponentScan
@SpringBootApplication
@Controller
public class DemoApplication {

	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "My Spring Boot Application using STS Tool";
	}
	
	// This is main method
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
