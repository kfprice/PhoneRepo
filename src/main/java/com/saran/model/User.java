package com.saran.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//MODEL->POJO and your business logic
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private String username;
	private String password;

	public boolean validateUserNamePwd(){
	if(username.equals("test") && password.equals("123")){
	  return true;
	}else {
		return false;
	}
 }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
