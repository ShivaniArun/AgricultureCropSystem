package com.capg.cropdeal.seller.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Sellers")
public class Seller {
	
	@Id
	private int id;
	private String name;
	private String loc;
	private int age;
	private int phone;
	
	public Seller(int id, String name, String loc, int age, int phone) {
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.age = age;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
