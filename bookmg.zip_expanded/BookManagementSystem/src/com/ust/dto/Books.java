package com.ust.dto;

public class Books {

	private int id;
	private String author;
	private String title;
	private float price;
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Books(int id,String title,String author, float price) {
		
		this.id=id;
		this.author = author;
		this.title=title;
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	

	
	
}
