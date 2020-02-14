package com.java.springbootcrud.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_info")
public class EmployeeInfo {
	
	//class properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Integer empId;
	
	@Column(name = "emp_name")
	private String empName;
	
	@Column(name = "emp_gender")
	private String empGender;
	
	@Column(name = "emp_department")
	private String empDepartment;
	
	@Column(name = "emp_dob")
	private Date empDOB;
	
	
	//getters and setters
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	
	public Date getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}
	
	@Override
	public String toString() {
		return "EmployeeInfo [empId=" + empId + ", empName=" + empName + ", empGender=" + empGender + ", empDepartment="
				+ empDepartment + ", empDOB=" + empDOB + "]";
	}
}
