package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback {
	
	@Id 
	private int fid;
	private String name;
	private String email;
	private String browser;
	private String experience;
	private String feedbackCategory;
	private String message;
	private Date date;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getFeedbackCategory() {
		return feedbackCategory;
	}
	public void setFeedbackCategory(String feedbackCategory) {
		this.feedbackCategory = feedbackCategory;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Feedback(int id, Date date, String name, String email, String browser,String experience, String feedbackCategory, String message) {
		super();
		this.fid = id;
		this.date = date;
		this.name = name;
		this.email = email;
		this.browser = browser;
		this.experience = experience;
		this.feedbackCategory = feedbackCategory;
		this.message = message;
	}
	@Override
	public String toString() {
		return "Feedback [fid=" + fid + ", name=" + name + ", email=" + email + ", experience=" + experience
				+ ", feedbackCategory=" + feedbackCategory + ", message=" + message + "]";
	}
	public Feedback() {
		super();

	}

	
}
