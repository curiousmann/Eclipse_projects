package com.ust.dto;

public class Book {

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String ttl, String athr, float price) {
		super();
		this.ttl = ttl;
		this.athr = athr;
		this.price = price;
	}
	private int bid;
	private String ttl;
	private String athr;
	private float price;
	public String getTtl() {
		return ttl;
	}
	public void setTtl(String ttl) {
		this.ttl = ttl;
	}
	public String getAthr() {
		return athr;
	}
	public void setAthr(String athr) {
		this.athr = athr;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	

	
	
}
