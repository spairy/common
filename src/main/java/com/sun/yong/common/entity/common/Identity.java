package com.sun.yong.common.entity.common;

public enum Identity {

	ADM("admin"),
	USR("user");
	
	private String identity;
	
	private Identity(String identity) {
		this.identity = identity;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
	
}
