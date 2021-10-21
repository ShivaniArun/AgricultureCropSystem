package com.capg.cropdeal.productservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Product")
public class CropDetails {
	
	@Id
	private int id;
	private String sellerName;
	private String cropType;
	private String cropName;
	private int quantity;
	private String location;
	
	public CropDetails(int id ,String sellerName, String cropType, String cropName, int quantity, String location) {
		this.id = id;
		this.sellerName = sellerName;
		this.cropType = cropType;
		this.cropName = cropName;
		this.quantity = quantity;
		this.location = location;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	} 
	
	@Override
	public String toString() {
		return String.format("CropDetails [cropType=%s, cropName=%s, quantity=%s, location=%s]", cropType, cropName,
				quantity, location);
	}
	
}
