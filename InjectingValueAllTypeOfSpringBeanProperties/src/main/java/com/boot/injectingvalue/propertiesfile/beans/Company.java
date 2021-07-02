package com.boot.injectingvalue.propertiesfile.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Company {

	private String name;
	private String location;
	private Integer size;
}
