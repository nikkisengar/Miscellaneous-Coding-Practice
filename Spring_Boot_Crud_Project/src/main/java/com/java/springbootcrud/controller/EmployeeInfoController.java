package com.java.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.springbootcrud.model.EmployeeInfo;
import com.java.springbootcrud.service.EmployeeInfoService;

@RestController
@RequestMapping("/api")
public class EmployeeInfoController {

	//injecting the service class
	@Autowired
	private EmployeeInfoService employeeInfoService;
	
	
	@GetMapping("/employeeInfo")
	public List<EmployeeInfo> getEmployeeInfo(){
		return employeeInfoService.getEmployeeInfo();
	}
}
