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
	 private Date creatAt;
	 private String lang;
	 private String place;
	 private double geo;
	 private String mediaUrl;
	 private long mediaId;
	 private long inReplyToId;
	 private Object post;
	 
	public Snippet() {
		
	}

	public Snippet(long id, String author, Date creatAt) {
		super();
		this.id = id;
		this.author = author;
		this.creatAt = creatAt;
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

	public Date getCreatAt() {
		return creatAt;
	}

	public void setCreatAt(Date creatAt) {
		this.creatAt = creatAt;
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

	public String getMediaUrl() {
		return mediaUrl;
	}

	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}

	public long getMediaId() {
		return mediaId;
	}

	public void setMediaId(long mediaId) {
		this.mediaId = mediaId;
	}

	public long getInReplyToId() {
		return inReplyToId;
	}

	public void setInReplyToId(long inReplyToId) {
		this.inReplyToId = inReplyToId;
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
				+ creatAt + ", lang=" + lang + ", place=" + place + ", geo="
				+ geo + ", media_url=" + mediaUrl + ", media_id=" + mediaId
				+ ", in_reply_to_id=" + inReplyToId + ", post=" + post + "]";
	}
	 
	 
}
