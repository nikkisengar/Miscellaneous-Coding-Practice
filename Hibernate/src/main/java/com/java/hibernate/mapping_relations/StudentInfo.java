package com.java.hibernate.mapping_relations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

@Entity
public class StudentInfo {
	
	@Id
	private int studRollNo;
	private String studName;
	private int studMarks;
	//@OneToOne
	//private Laptop laptop;
	@OneToMany
	private List<Laptop> laptop=new ArrayList<Laptop>();
	
	//setters and getters
	public int getStudRollNo() {
		return studRollNo;
	}
	public void setStudRollNo(int studRollNo) {
		this.studRollNo = studRollNo;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudMarks() {
		return studMarks;
	}
	public void setStudMarks(int studMarks) {
		this.studMarks = studMarks;
	}
	/*
	 * public Laptop getLaptop() { return laptop; } public void setLaptop(Laptop
	 * laptop) { this.laptop = laptop; }
	 */
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	
	@Override
	public String toString() {
		return "StudentInfo [studRollNo=" + studRollNo + ", studName=" + studName + ", studMarks=" + studMarks + "]";
	}
}
