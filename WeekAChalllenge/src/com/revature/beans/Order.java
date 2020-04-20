package com.revature.beans;

public class Order {
	private Integer id;
	private Double price;
	private String name;
	
	public Order(int id, double price, String name) {
		this.id = id;
		this.price = price;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setId(byte id) {
		this.id = (int)id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
}
