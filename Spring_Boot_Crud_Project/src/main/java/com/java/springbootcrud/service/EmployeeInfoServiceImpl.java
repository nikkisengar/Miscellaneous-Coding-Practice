package com.java.springbootcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.java.springbootcrud.dao.EmployeeInfoDAO;
import com.java.springbootcrud.model.EmployeeInfo;

//We mark beans with @Service to indicate that it's holding the business logic. So there's no any other specialty except using it in the service layer.

@Service
public class EmployeeInfoServiceImpl implements EmployeeInfoService{

	
	//injecting the DAO class 
	@Autowired
	private EmployeeInfoDAO employeeInfoDAO;
	
	@Transactional
	@Override
	public List<EmployeeInfo> getEmployeeInfo() {
		return employeeInfoDAO.getEmployeeInfo();
	}

	@Transactional
	@Override
	public EmployeeInfo getEmployeeInfoById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	@Override
	public void saveEmployeeInfo(EmployeeInfo empInfo) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	@Override
	public void deleteEmployeeInfoById(int empId) {
		// TODO Auto-generated method stub
		
	}
}
