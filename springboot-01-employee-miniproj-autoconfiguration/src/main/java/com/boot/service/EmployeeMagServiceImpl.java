package com.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.bo.EmployeeBO;
import com.boot.dao.IEmployeeDAO;
import com.boot.dto.EmployeeDTO;

@Service
public class EmployeeMagServiceImpl implements IEmployeeMagService {

	@Autowired
	IEmployeeDAO employeeDao;
	
	@Override
	public List<EmployeeDTO> getEmpJobType(String[] jobType) throws Exception {
		String jobTypeStr = null;
		StringBuffer buffer = null;
		if(jobType.length > 0) {
			buffer = new StringBuffer("(");
			for(int i=0;i<jobType.length;i++) {
				
				if(i == jobType.length-1) {
					buffer.append("'"+jobType[i]+"')");
				}else {
					buffer.append(("'"+jobType[i]+"', "));
				}
			}
		}
		jobTypeStr = buffer.toString();
		
		List<EmployeeBO> listBo = employeeDao.getEmployeeJobType(jobTypeStr);
		//DTO list
		List<EmployeeDTO> listDto = new ArrayList<EmployeeDTO>();
		
		listBo.forEach( bo -> {
			EmployeeDTO dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSrNo(listDto.size()+1);
			listDto.add(dto);
		});
		return listDto;
	}

}
