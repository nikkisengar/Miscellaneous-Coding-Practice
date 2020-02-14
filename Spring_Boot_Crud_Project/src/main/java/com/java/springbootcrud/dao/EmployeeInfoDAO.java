package com.java.springbootcrud.dao;

import java.util.List;

import com.java.springbootcrud.model.EmployeeInfo;

public interface EmployeeInfoDAO {
	
	//get all the employee info
	List<EmployeeInfo> getEmployeeInfo();
	
	//get a specific employee info
	EmployeeInfo getEmployeeInfoById(int empId);
	
	
	//Save all the employee info
	void saveEmployeeInfo(EmployeeInfo empInfo);
	
	//delete a specific employee info
	void deleteEmployeeInfoById(int empId);
	
}
