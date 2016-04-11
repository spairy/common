package com.sun.yong.common.entity.model;

import com.sun.yong.common.entity.common.Identity;

public class UserInfo {

	private String ID;
	
	private String username;
	
	private String Name;
	
	private String bithYear;
	
	private String birthMonth;
	
	private String birthDay;
	
	private Identity identity;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBithYear() {
		return bithYear;
	}

	public void setBithYear(String bithYear) {
		this.bithYear = bithYear;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public Identity getIdentity() {
		return identity;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}
}
