package com.paperboat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class ShippingAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;

	@NotEmpty(message= "Apartment Number cannot be blank")   
private String apartmentNumber;

	@NotEmpty(message= "Street name cannot be blank")
private String streetName;
	
	@NotEmpty(message= "City cannot be blank")
	private String city;

	@NotEmpty(message= "State cannot be blank")
	private String State;
	
	@NotEmpty(message= "Country cannot be blank")
	private String country;

	@NotEmpty(message= "Zipcode cannot be blank")
	private String zipcode;

	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
	return State;
}
public void setState(String state) {
	State = state;
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
