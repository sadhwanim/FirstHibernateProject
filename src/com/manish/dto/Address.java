package com.manish.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
private String street;
private String pincode;
private String 	city;
private String state;
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
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

}
