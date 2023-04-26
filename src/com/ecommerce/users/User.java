package com.ecommerce.users;

public abstract class User {
	String userid = "";
	String password = "";
	String loginStatus = "";

	abstract boolean verifyUser();

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}
}
