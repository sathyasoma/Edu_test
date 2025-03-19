package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {


	@Bean("keerthi")
	public Employee getEmployee() {
		Employee emp= new Employee();
		
		emp.setEmpid(000);
		emp.setEmpname("keerthi");
		emp.setEmpsal(5555);
		
		return emp;
	}
	@Lazy(value = true)
	@Bean("add")
	public Address getAddress() {
		  
		Address add= new Address();
		
		add.setHnum(1111);
		add.setPincode(20000);
		add.setState("jh");
		add.setStreet("nlg");
		 
		return add;
	}
	
}
