package com.keko.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping(produces= {"application/json", "text/xml"})
public class HelloWorldController {
	
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorld(@PathVariable("name") String name) {
		//throw new RuntimeException("Something wrong");
		return new HelloWorldBean("Hello World, "+name);
	}
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	
}
