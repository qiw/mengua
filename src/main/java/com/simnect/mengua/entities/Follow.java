/**
 * 
 */
package com.simnect.mengua.entities;

/**
 * @author kwang
 *
 */
public class Follow {

	private long followerId;
	private long followeeId;
	public Follow() {
	}
	
	public Follow(long followerId, long followeeId) {
		super();
		this.followerId = followerId;
		this.followeeId = followeeId;
	}

	
	public long getFollowerId() {
		return followerId;
	}

	public void setFollowerId(long followerId) {
		this.followerId = followerId;
	}

	public long getFolloweeId() {
		return followeeId;
	}

	public void setFolloweeId(long followeeId) {
		this.followeeId = followeeId;
	}

	@Override
	public String toString() {
		return "Follow [follower_id=" + followerId + ", followee_id="
				+ followeeId + "]";
	}
	
}
