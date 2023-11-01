package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class PraticeDemoApplication {
	@GetMapping
	public String getMessage() {
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(PraticeDemoApplication.class, args);
	}

}
