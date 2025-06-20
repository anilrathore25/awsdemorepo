package com.yash.awstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwstestApplication {
	@GetMapping("welcome")
	public String Demo(){
		return" hello this is the testing of deploying the cicd in aws";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwstestApplication.class, args);
	}

}
