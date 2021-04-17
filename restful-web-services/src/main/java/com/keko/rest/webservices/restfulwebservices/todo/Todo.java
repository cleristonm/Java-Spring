package com.keko.rest.webservices.restfulwebservices.todo;

import java.util.Date;

public class Todo {
	private long id;
	private String username;
	private String description;
	private Date target;
	private boolean isDone;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTarget() {
		return target;
	}
	public void setTarget(Date target) {
		this.target = target;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	public Todo(long id, String username, String description, Date target, boolean isDone) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.target = target;
		this.isDone = isDone;
	}
	
	

}
