package com.boot.value.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("itemprice")
@ToString
public class ItemList {

	//private is not applicable
	@Value("${dosa.price}")
	public float dosa;
	@Value("${idly.price}")
	public float idly;
	@Value("${poha.price}")
	public int poha;
	
}
