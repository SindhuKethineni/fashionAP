package com.fashionapp.Entity;

public class BlockedUsers {
	
	/*To-DO : user can block another user with out follwing him*/
	
	private long id;
	private String userId;
	private String userName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	

}
