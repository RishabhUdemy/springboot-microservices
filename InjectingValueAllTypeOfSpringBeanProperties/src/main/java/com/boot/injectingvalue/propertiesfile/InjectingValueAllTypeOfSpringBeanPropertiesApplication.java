package com.boot.injectingvalue.propertiesfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.injectingvalue.propertiesfile.beans.EmployeeDetails;

@SpringBootApplication
public class InjectingValueAllTypeOfSpringBeanPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(InjectingValueAllTypeOfSpringBeanPropertiesApplication.class, args);
		EmployeeDetails emp = ctx.getBean("empdetail",EmployeeDetails.class);
		System.out.println(emp);
	}

}
