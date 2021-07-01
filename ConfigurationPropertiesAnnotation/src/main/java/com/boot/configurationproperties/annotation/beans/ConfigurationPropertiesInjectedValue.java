package com.boot.configurationproperties.annotation.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("configproperties")
@ConfigurationProperties(prefix = "org.website")
public class ConfigurationPropertiesInjectedValue {

	private String name;
	private String location;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ConfigurationPropertiesInjectedValue [name=" + name + ", location=" + location + ", type=" + type + "]";
	}
	
	
}
