package com.capg.cropdeal.transportservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Vehicle")
public class VehicleDetails {

	@Id
	private int id;
	private String regNumber;
	private String driverName;
	
	public VehicleDetails(int id, String regNumber, String driverName) {
		this.id = id;
		this.regNumber = regNumber;
		this.driverName = driverName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	
}
