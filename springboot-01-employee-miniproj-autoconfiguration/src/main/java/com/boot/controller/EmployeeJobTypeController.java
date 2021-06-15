package com.boot.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.boot.dto.EmployeeDTO;
import com.boot.service.IEmployeeMagService;
import com.boot.vo.EmployeeVO;

@Controller("empcontroller")
public class EmployeeJobTypeController {

	@Autowired
	IEmployeeMagService employeeService;
	
	public List<EmployeeVO> showEmployeeJobType(String[] jobType) throws Exception{
		
		List<EmployeeDTO> listDto = employeeService.getEmpJobType(jobType);
		List<EmployeeVO> listVo = new ArrayList<EmployeeVO>();
		
		listDto.forEach(dto -> {
			EmployeeVO vo = new EmployeeVO();
			BeanUtils.copyProperties(dto, vo);
			vo.setSrNo(String.valueOf(dto.getSrNo()));
			vo.setEmpid(String.valueOf(dto.getEmpid()));
			vo.setSalary(String.valueOf(dto.getSalary()));
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			String todayAsString = df.format(dto.getDateofjoining());
			vo.setDateofjoining(todayAsString);
			listVo.add(vo);
		});
		return listVo;
	}
}
