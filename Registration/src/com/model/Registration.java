package com.model;

public class Registration {

	private String uname;
	private String city;
	private String email;
	public Registration(String uname, String city, String email) {
		super();
		this.uname = uname;
		this.city = city;
		this.email = email;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
