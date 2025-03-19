package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.demo")
public class Test {

	public static void main(String[] args) {
		
		
		//Employee emp = new Employee();
		
//		
//		Resource resource= new ClassPathResource("SpringConfig.xml");
//		BeanFactory factory= new XmlBeanFactory(resource);
	
		//ApplicationContext factory = new ClassPathXmlApplicationContext("SpringConfig.xml");

ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
	//ApplicationContext factory= new AnnotationConfigApplicationContext(Test.class);	
		Employee emp=(Employee) factory.getBean("keerthi");
		//Employee emp1=(Employee) factory.getBean("employee");
//		emp.setEmpid(123);
//		emp.setEmpname("trisha");
	//	emp.display();
		System.out.println(emp);
		//System.out.println(emp1);
	}
}
