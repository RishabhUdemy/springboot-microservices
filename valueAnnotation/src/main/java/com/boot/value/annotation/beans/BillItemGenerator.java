package com.boot.value.annotation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("bill")
@ToString
public class BillItemGenerator {

	@Value("#{itemprice.dosa + itemprice.idly + itemprice.poha}")
	private float total;
	
	@Autowired
	private ItemList list;
	
}
