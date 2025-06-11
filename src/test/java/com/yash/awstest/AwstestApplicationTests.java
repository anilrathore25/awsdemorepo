package com.yash.awstest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootTest
class AwstestApplicationTests {
@GetMapping("welcome")
	public String Demo(){
		return" hello this is the testing of deploying the cicd in aws";
	}
	@Test
	void contextLoads() {
	}

}
