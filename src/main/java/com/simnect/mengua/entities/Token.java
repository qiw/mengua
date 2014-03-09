/**
 * 
 */
package com.simnect.mengua.entities;

/**
 * @author kwang
 *
 */
public class Token {
	private long user_id;
	private long id;
	private String context;
	public Token(long user_id, long id, String context) {
		super();
		this.user_id = user_id;
		this.id = id;
		this.context = context;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	@Override
	public String toString() {
		return "Token [user_id=" + user_id + ", id=" + id + ", context="
				+ context + "]";
	}
	
	
}
