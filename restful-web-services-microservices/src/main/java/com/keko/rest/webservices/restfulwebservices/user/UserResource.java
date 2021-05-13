package com.keko.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDAOService service;
	
	@GetMapping(path = "/users")
	public List<User> retrieveAllUsers(){
		return service.findAll(); 
	}

	@GetMapping(path = "/user/{id}")
	public User retriveUser(@PathVariable(name = "id" ) Integer id ) {		
		return service.findOne(id);
	}
}
