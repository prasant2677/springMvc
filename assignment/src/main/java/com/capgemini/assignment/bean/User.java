package com.capgemini.assignment.bean;

import java.io.Serializable;

public class User implements Serializable {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("This is User Bean : " +name);
	}

}
