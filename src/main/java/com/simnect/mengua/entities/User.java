package com.simnect.mengua.entities;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="Users")
@XmlRootElement
public class User {
	@Basic(optional=false)
	@Column(name="user_id")
	@GeneratedValue
	@Id
	private long id;
	
	@Basic(optional=false)
    @Column(name="screen_name")
	private String screenName;
	
	private String displayName;
	private String gender;
	private String place;
	private Date birthday;
	private String description;
	private String email;
	private String qq;
	private String wechat;
	private String weibo;
	private String profileImage;

	public User() {

	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getScreenName() {
		return screenName;
	}


	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}


	public String getDisplayName() {
		return displayName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getQq() {
		return qq;
	}


	public void setQq(String qq) {
		this.qq = qq;
	}


	public String getWechat() {
		return wechat;
	}


	public void setWechat(String wechat) {
		this.wechat = wechat;
	}


	public String getWeibo() {
		return weibo;
	}


	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}


	public String getProfileImage() {
		return profileImage;
	}


	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

}
