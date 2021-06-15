package com.boot.bo;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeBO {

	private Integer empid;
	private String ename;
	private String jobType;
	private Date dateofjoining;
	private double salary;
}
