package com.boot.value.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.value.annotation.beans.BillItemGenerator;

@SpringBootApplication
public class ValueAnnotationApplication {

	public static void main(String[] args) {
		//Generating IOC Container
		ApplicationContext context =  SpringApplication.run(ValueAnnotationApplication.class, args);
		BillItemGenerator bill = context.getBean("bill",BillItemGenerator.class);
		System.out.println(bill);
	}

}
