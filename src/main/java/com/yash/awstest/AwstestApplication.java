
package com.yash.awstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AwstestApplication {
	@GetMapping("/welcome")
	public String Demo(){
		return" hello this is  testing of API";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwstestApplication.class, args);
	}

}
