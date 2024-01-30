package com.main.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {
	@NotBlank(message="user name is not empty")
	@Size(min=3,max=12,message = "username name mjust be between 3-12 character")
	private String username;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" ,message = "Invalid email id")
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public LginData() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
	@Override
	public String toString() {
		return "LoginData [username=" + username + ", email=" + email + "]";
	}
	

}
