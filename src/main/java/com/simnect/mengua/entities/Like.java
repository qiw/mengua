/**
 * 
 */
package com.simnect.mengua.entities;

/**
 * @author kwang
 *
 */
public class Like {
	private long userId;
	private long gameId;
	
	public Like() {
	}
	
	public Like(long userId, long gameId) {
		this.userId = userId;
		this.gameId = gameId;
	}
	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getGameId() {
		return gameId;
	}

	public void setGameId(long gameId) {
		this.gameId = gameId;
	}

	@Override
	public String toString() {
		return "Like [user_id=" + userId + ", game_id=" + gameId + "]";
	}
	
	
	
}
