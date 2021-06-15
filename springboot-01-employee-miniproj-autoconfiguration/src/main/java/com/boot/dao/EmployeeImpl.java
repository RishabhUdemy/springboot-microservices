package com.boot.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.bo.EmployeeBO;

@Repository("empDao")
public class EmployeeImpl implements IEmployeeDAO {

	private static final String GET_EMP_BY_JOBTYPE = "select empid,empname,jobtype,dateofjoining,salary from employee where jobtype in ";
	@Autowired
	DataSource dataSource;
	
	@Override
	public List<EmployeeBO> getEmployeeJobType(String cond) throws Exception{
		List<EmployeeBO> listBo = null;
		try(
				Connection conn = dataSource.getConnection();
				Statement stmt = conn.createStatement();	
			){
			//send and execute SQL query
			ResultSet rs = stmt.executeQuery(GET_EMP_BY_JOBTYPE+cond+" ORDER BY JOBTYPE");
			listBo = new ArrayList<EmployeeBO>();
			EmployeeBO employeeBo;
			while(rs.next()) {
				employeeBo = new EmployeeBO();
				employeeBo.setEmpid(rs.getInt(1));
				employeeBo.setEname(rs.getString(2));
				employeeBo.setJobType(rs.getString(3));
				employeeBo.setDateofjoining(rs.getTimestamp(4));
				employeeBo.setSalary(rs.getDouble(5));
				listBo.add(employeeBo);
			}//end while
			
		}//end try
		catch(SQLException ex) {
			ex.printStackTrace();
			throw ex;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return listBo;
	}//end method

}//class end
