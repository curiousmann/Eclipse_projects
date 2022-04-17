package com.bean;

public class Product {

	public Product() {
		super();
	}
	private int productId,quantity,discount;
	private String productName;
	private double cost;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuatity() {
		return quantity;
	}
	public void setQuatity(int quatity) {
		this.quantity = quatity;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void calculateDiscount() {
		if(cost*quantity>1000) {
			setDiscount(20);
		}
		else if (cost*quantity<=1000 && cost*quantity>=500) {
			setDiscount(10);
		}
		else
			setDiscount(0);
	}
}
