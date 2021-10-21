package com.capg.cropdeal.admin.model;

public class Buyer {
	
	private String name;
	private String loc;
	private int age;
	private int phone;	
	
	public Buyer() {
	}
	public Buyer(String name, String loc, int age, int phone) {
		this.name = name;
		this.loc = loc;
		this.age = age;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}
