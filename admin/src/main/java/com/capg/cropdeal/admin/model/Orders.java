package com.capg.cropdeal.admin.model;

public class Orders {

	private String id;
	private String productId;
	private String sellerName;
	private String buyerName;
	
	
	public Orders() {
	}


	public Orders(String id, String productId, String sellerName, String buyerName) {
		this.id = id;
		this.productId = productId;
		this.sellerName = sellerName;
		this.buyerName = buyerName;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public String getBuyerName() {
		return buyerName;
	}


	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	
	
}
