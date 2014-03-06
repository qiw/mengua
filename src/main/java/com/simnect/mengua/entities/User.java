package com.simnect.mengua.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private String name;
	private long id;
	
	public User() {
		
	}
	
	public User(long id) {
		this.name = "test";
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
}
