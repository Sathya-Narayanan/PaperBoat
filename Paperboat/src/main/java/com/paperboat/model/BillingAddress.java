package com.paperboat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class BillingAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
private int Id;
	@NotEmpty(message= "Apartment Number cannot be blank")   //to prevent null values in the fields
private String apartmentNumber;
	@NotEmpty(message= "streetName cannot be blank")
private String streetName;
	@NotEmpty(message= "City cannot be blank")
private String city;
	@NotEmpty(message= "state cannot be blank")	
private String state;
	@NotEmpty(message= "country cannot be blank")
private String country;
	@NotEmpty(message= "Zipcode  cannot be blank")
private String zipcode;
	
							/*Generating Getter and Setters Methods*/
	
	public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getApartmentNumber() {
	return apartmentNumber;
}
public void setApartmentNumber(String apartmentNumber) {
	this.apartmentNumber = apartmentNumber;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

}
