package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
	
	@Bean
	public EnglishService helloService() {
		EnglishService hs = new EnglishService();
		hs.setMessage("Hello world!");
		return hs;
	}
}
