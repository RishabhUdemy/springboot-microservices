package com.boot.service;

import java.util.List;

import com.boot.dto.EmployeeDTO;

public interface IEmployeeMagService {

	public List<EmployeeDTO> getEmpJobType(String[] jobType) throws Exception;
}
