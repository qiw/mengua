/**
 * 
 */
package com.simnect.mengua.entities;

/**
 * @author kwang
 *
 */
public class Token {
	private long userId;
	
	public Token() {
	}
	
	private long id;
	private String context;
	public Token(long userId, long id, String context) {
		super();
		this.userId = userId;
		this.id = id;
		this.context = context;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
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
		return "Token [user_id=" + userId + ", id=" + id + ", context="
				+ context + "]";
	}
	
	
}
