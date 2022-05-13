package com.skillsoft.junit.junit_project3_3;

public class Product {

	String brandName;
	String model;
	Integer id;
	int price;
	String category;
	
	public Product(String brandName, String model, Integer id, int price, String category) {
		super();
		this.brandName = brandName;
		this.model = model;
		this.id = id;
		this.price = price;
		this.category = category;
	}

	public String getBrandName() {
		return brandName;
	}

	
	public String getModel() {
		return model;
	}

	
	public Integer getId() {
		return id;
	}

	
	public int getPrice() {
		return price;
	}

	

	public String getCategory() {
		return category;
	}

}
