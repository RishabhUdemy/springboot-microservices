package com.boot.configurationproperties.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("valueannotaion")
@ToString
public class ValueInjectedValue {

	@Value("${org.website.name}")
	private String name;
	@Value("${org.website.location}")
	private String address;
	@Value("${org.website.type}")
	private String videotype;
	
}
