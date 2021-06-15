package com.boot.dao;

import java.util.List;

import com.boot.bo.EmployeeBO;

public interface IEmployeeDAO {
	
	List<EmployeeBO> getEmployeeJobType(String cond) throws Exception;
}
