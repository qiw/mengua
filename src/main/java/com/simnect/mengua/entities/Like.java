/**
 * 
 */
package com.simnect.mengua.entities;

/**
 * @author kwang
 *
 */
public class Like {
	private long user_id;
	private long game_id;
	public Like(long user_id, long game_id) {
		this.user_id = user_id;
		this.game_id = game_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getGame_id() {
		return game_id;
	}
	public void setGame_id(long game_id) {
		this.game_id = game_id;
	}
	@Override
	public String toString() {
		return "Like [user_id=" + user_id + ", game_id=" + game_id + "]";
	}
	
	
	
}
