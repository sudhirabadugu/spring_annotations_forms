package com.spring.spring.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap <String, String> countrynames;
	
	public Student()
	{
		/*countrynames = new LinkedHashMap<>();
		countrynames.put("BR", "Brazil");
		countrynames,put("")*/
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	

}
