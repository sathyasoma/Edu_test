package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("employee")
//@Scope("prototype")
public class Employee {

	private int empid;
	private String empname;
	private int empsal;
	
	@Autowired //by type
	Address address; //has- rel

	

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpsal() {
		return empsal;
	}

	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired  //byname
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee() {
		System.out.println("welcome emp");
	}

	//@Autowired
	public Employee(int empid, String empname, int empsal, Address address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", address=" + address
				+ "]";
	}
	
	
}
