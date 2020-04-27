package com.capgemini.assignment.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class Message implements Serializable {

	private String message;
	@Autowired
	private User user;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void print() {
		System.out.println("This is Message Bean : " +message);
		user.print();
	}

}