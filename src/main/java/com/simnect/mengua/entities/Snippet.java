/**
 * 
 */
package com.simnect.mengua.entities;

import java.util.Date;

/**
 * @author kwang
 *
 *top-level posts within a game,comments which belong to one snippet.
 *For backend’s perspective, everything is a snippet, 
 *which is some text + images(or video clip in the future).
 */
public class Snippet {
	 private long id;
	 private String author;
	 private Date creat_at;
	 private String lang;
	 private String place;
	 private double geo;
	 private String media_url;
	 private long media_id;
	 private long in_reply_to_id;
	 private Object post;
	 
	public Snippet(long id, String author, Date creat_at) {
		super();
		this.id = id;
		this.author = author;
		this.creat_at = creat_at;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreat_at() {
		return creat_at;
	}

	public void setCreat_at(Date creat_at) {
		this.creat_at = creat_at;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getGeo() {
		return geo;
	}

	public void setGeo(double geo) {
		this.geo = geo;
	}

	public String getMedia_url() {
		return media_url;
	}

	public void setMedia_url(String media_url) {
		this.media_url = media_url;
	}

	public long getMedia_id() {
		return media_id;
	}

	public void setMedia_id(long media_id) {
		this.media_id = media_id;
	}

	public long getIn_reply_to_id() {
		return in_reply_to_id;
	}

	public void setIn_reply_to_id(long in_reply_to_id) {
		this.in_reply_to_id = in_reply_to_id;
	}

	public Object getPost() {
		return post;
	}

	public void setPost(Object post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Snippet [id=" + id + ", author=" + author + ", creat_at="
				+ creat_at + ", lang=" + lang + ", place=" + place + ", geo="
				+ geo + ", media_url=" + media_url + ", media_id=" + media_id
				+ ", in_reply_to_id=" + in_reply_to_id + ", post=" + post + "]";
	}
	 
	 
}
