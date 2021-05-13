package com.keko.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {
	
	private static int usersCount = 3; 
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Adm", new Date()));
		users.add(new User(2, "john", new Date()));
		users.add(new User(3, "mary", new Date()));
	}
	
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user) {
		if (user.getId()==null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;		
	}
	
	public User findOne(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public User deleteById(Integer id) {
		User user = findOne(id);
		users.remove(user);		
		return user;
		
	}
	
}
