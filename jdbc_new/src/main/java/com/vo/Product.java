package com.vo;

public class Product {
private  int id;
private String name;
private String desc;
private float price;
public Product(int id, String name, float price,String desc) {
	super();
	this.id = id;
	this.name = name;
	this.desc = desc;
	this.price = price;
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
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Product() {
	// TODO Auto-generated constructor stub
}
}
