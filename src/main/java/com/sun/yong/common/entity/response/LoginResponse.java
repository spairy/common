package com.sun.yong.common.entity.response;

import com.sun.yong.common.entity.common.BaseResponse;

public class LoginResponse extends BaseResponse {

	private static final long serialVersionUID = -8313935569006454256L;

	private String memberID;
	
	private String username;
	
	private String identity;
	
	private String level;
	
	private Integer points;

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}
}
