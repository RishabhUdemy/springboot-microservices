package com.boot.configurationproperties.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.configurationproperties.annotation.beans.ConfigurationPropertiesInjectedValue;
import com.boot.configurationproperties.annotation.beans.ValueInjectedValue;

@SpringBootApplication
public class ConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx =  SpringApplication.run(ConfigurationPropertiesAnnotationApplication.class, args);
		ConfigurationPropertiesInjectedValue configprop = ctx.getBean("configproperties",ConfigurationPropertiesInjectedValue.class);
		System.out.println(configprop);
		
		ValueInjectedValue value = ctx.getBean("valueannotaion",ValueInjectedValue.class);
		System.out.println(value);
	}

}
