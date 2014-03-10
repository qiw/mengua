/**
 * 
 */
package com.simnect.mengua.entities;

/**
 * @author kwang
 *
 */
public class Game {

	public Game() {
	}
	
	public Game(long id, String name) {
		
		this.id = id;
		this.name = name;
	}

	private long id;
	private String name;
	private String desc;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}
	
}
