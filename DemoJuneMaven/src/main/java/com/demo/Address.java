package com.demo;

import org.springframework.stereotype.Component;

//@Component("add")
public class Address {

	
	private int hnum;
	private String street;
	private String state;
	private int pincode;
	public int getHnum() {
		return hnum;
	}
	public void setHnum(int hnum) {
		this.hnum = hnum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	public Address() {
		System.out.println("welcome add");
	}
	public Address(int hnum, String street, String state, int pincode) {
		super();
		this.hnum = hnum;
		this.street = street;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [hnum=" + hnum + ", street=" + street + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
}
