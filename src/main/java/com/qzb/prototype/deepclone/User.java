package com.qzb.prototype.deepclone;

public class User {
	
	public String name;
	private String sex;
	
	public User(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", sex=" + sex + "]";
	}
}
