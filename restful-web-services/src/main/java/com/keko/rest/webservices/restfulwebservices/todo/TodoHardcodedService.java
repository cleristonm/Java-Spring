package com.keko.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "keko", "Learn do dance", new Date(), false));
		todos.add(new Todo(++idCounter, "keko", "Learn about Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "keko", "Sell my car", new Date(), false));
		todos.add(new Todo(++idCounter, "keko", "Rent a house", new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}

	public Todo deleteById(int id) {
		Todo todo = findById(id);
		if (todo == null) {
			return null;
		}
		todos.remove(todo);
		return todo;
	}

	public Todo findById(int id) {
		for (Todo todo : todos) {
			if (todo.getId()== id) {
				return todo;
			}
		}
		return null;
	}

}
