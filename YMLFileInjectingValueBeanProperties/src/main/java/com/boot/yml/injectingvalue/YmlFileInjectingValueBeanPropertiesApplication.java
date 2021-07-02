package com.boot.yml.injectingvalue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.yml.injectingvalue.beans.EmployeeDetails;

@SpringBootApplication
public class YmlFileInjectingValueBeanPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(YmlFileInjectingValueBeanPropertiesApplication.class, args);
		EmployeeDetails emp = ctx.getBean("empdetail",EmployeeDetails.class);
		System.out.println(emp);
	}

}
