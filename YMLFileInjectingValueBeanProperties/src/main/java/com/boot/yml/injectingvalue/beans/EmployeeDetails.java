package com.boot.yml.injectingvalue.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("empdetail")
@ConfigurationProperties(prefix="org.emp.detail")
public class EmployeeDetails {

	private Long id;
	private String name;
	private String[] nickName;
	private List<String> teamMember;
	private Set<Long> phoneNumber;
	private Map<String, String> idDetails;
	private Company companyDetail;
}
