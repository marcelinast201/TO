package com.example.payroll;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication

public class BookStore {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BookStore.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);
	}

}


