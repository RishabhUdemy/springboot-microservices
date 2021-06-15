package com.boot.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer srNo;
	private Integer empid;
	private String ename;
	private String jobType;
	private Date dateofjoining;
	private double salary;
}
