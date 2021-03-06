package com.paperboat.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category 

{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String categoryDetails;
@OneToMany(mappedBy="category")
private List<Product> products;

						/*Generating Getters and Setters Methods*/

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCategoryDetails() {
	return categoryDetails;
}
public void setCategoryDetails(String categoryDetails) {
	this.categoryDetails = categoryDetails;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}

public String toString()
{
	return categoryDetails;
	
}
}
