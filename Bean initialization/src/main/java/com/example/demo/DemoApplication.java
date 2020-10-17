package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private EnglishService englishService;
	
	@Autowired
	private FrançaisService françaisService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("The message from EnglishService..: "+ englishService.getMessage());				
		System.out.println("The message from FrançaisService.: "+ françaisService.getMessage());
	}
	
	
	
	
}
