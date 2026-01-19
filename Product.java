package com.tka.jan18;

public class Product {

	private int p_id;
	private String name;
	private int price;
	private String category;
	private String expiry;
	private int qantity;
	private String brand;
	private String color;
	private String manufacturer;
	private double weight;
	
	public Product() {
		
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public int getQantity() {
		return qantity;
	}

	public void setQantity(int qantity) {
		this.qantity = qantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getWeigth() {
		return weight;
	}

	public void setWeigth(double weigth) {
		this.weight = weight;
	}
	
	public Product(int p_id,String name,int price,String category,String expiry,int qantity,String brand,String color,String manufacturer,double weight) {
		super();
		this.p_id=p_id;
		this.name=name;
		this.price=price;
		this.category=category;
		this.expiry=expiry;
		this.qantity=qantity;
		this.brand=brand;
		this.color=color;
		this.manufacturer=manufacturer;
		this.weight=weight;
	}

	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", name=" + name + ", price=" + price + ", category=" + category + ", expiry="
				+ expiry + ", qantity=" + qantity + ", brand=" + brand + ", color=" + color + ", manufacturer="
				+ manufacturer + ", weigth=" + weight + "]";
	}
	
	
}
		