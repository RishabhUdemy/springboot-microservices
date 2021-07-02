package com.boot.yml.injectingvalue.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Company {

	private String name;
	private String location;
	private Integer size;
}
