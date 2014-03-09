/**
 * 
 */
package com.simnect.mengua.entities;

/**
 * @author kwang
 *
 */
public class Follow {

	private long follower_id;
	private long followee_id;
	public Follow(long follower_id, long followee_id) {
		super();
		this.follower_id = follower_id;
		this.followee_id = followee_id;
	}
	public long getFollower_id() {
		return follower_id;
	}
	public void setFollower_id(long follower_id) {
		this.follower_id = follower_id;
	}
	public long getFollowee_id() {
		return followee_id;
	}
	public void setFollowee_id(long followee_id) {
		this.followee_id = followee_id;
	}
	@Override
	public String toString() {
		return "Follow [follower_id=" + follower_id + ", followee_id="
				+ followee_id + "]";
	}
	
}
