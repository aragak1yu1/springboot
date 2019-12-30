package com.yf.pojo;

public class User {
	
	private Integer userId;
	private String username;
	private Integer userage;
	public User(Integer userId, String username, Integer userage) {
		super();
		this.userId = userId;
		this.username = username;
		this.userage = userage;
	}
	public User() {
		super();
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUserage() {
		return userage;
	}
	public void setUserage(Integer userage) {
		this.userage = userage;
	}
}
