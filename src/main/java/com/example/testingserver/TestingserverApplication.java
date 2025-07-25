package com.example.testingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingserverApplication {

	public static void main(String[] args) {

		System.out.println("Welcome to github project testing server");
		SpringApplication.run(TestingserverApplication.class, args);
	}

}
