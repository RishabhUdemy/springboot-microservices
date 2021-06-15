package com.boot.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeVO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String srNo;
	private String empid;
	private String ename;
	private String jobType;
	private String dateofjoining;
	private String salary;
}
