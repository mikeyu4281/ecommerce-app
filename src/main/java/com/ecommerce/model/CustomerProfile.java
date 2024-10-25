package com.ecommerce.model;

public class CustomerProfile {

	private String firstName;
	private String lastName; 
	private String city;
	private String country;
	private String hkidNo;
	
	@Override
	public String toString() {
		return "CustomerProfile [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", country="
				+ country + ", hkidNo=" + hkidNo + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHkidNo() {
		return hkidNo;
	}
	public void setHkidNo(String hkidNo) {
		this.hkidNo = hkidNo;
	}
	
	
	
}
