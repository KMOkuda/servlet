package model;

import java.io.Serializable;

public class Login implements Serializable{
	String userId;
	String pass;

	public Login() {

	}

	public Login(String userId, String pass) {
		super();
		this.userId = userId;
		this.pass = pass;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

}
