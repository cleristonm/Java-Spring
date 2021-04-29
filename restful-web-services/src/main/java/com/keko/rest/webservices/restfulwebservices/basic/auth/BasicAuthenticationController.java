package com.keko.rest.webservices.restfulwebservices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping(produces= {"application/json", "text/xml"})
public class BasicAuthenticationController {
	
	
	@GetMapping(path="/basicauth")
	public BasicAuthenticationBean helloWorldBean() {
		return new BasicAuthenticationBean("You are authenticated");
	}
	
	
}
