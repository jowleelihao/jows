package com.login.pojo;

import java.util.*;



public class accout {
  private String username;
  private String password;
  private String gender;
  private String email;
  private String phone;
  private Date  birth;


/**
 * 有参构造函数
 * @param username
 * @param password
 * @param gender
 */


/**
 *无参构造函数 
 */
public accout() {
}

public accout(String username, String password, String gender, String email, String phone, Date birth) {
	super();
	this.username = username;
	this.password = password;
	this.gender = gender;
	this.email = email;
	this.phone = phone;
	this.birth = birth;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}


@Override
public String toString() {
	return "accout [username=" + username + ", password=" + password + ", gender=" + gender + ", email=" + email
			+ ", phone=" + phone + ", birth=" + birth + "]";
}

public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Date getBirth() {
	return birth;
}

public void setBirth(Date birth) {
	
	this.birth = birth;
}
  

}
