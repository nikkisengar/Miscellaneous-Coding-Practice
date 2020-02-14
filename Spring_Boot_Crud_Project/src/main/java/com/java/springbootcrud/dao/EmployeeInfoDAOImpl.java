package com.java.springbootcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.query.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.springbootcrud.model.EmployeeInfo;

//@Repository annotation is used for the DAO class where the database operations are involved

@Repository
public class EmployeeInfoDAOImpl implements EmployeeInfoDAO{
	
	//In DAO class we will inject the session factory to get the current session object, In JPA we will use EntityManager as SessionFactory
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<EmployeeInfo> getEmployeeInfo() {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<EmployeeInfo> query=currentSession.createQuery("from EmployeeInfo", EmployeeInfo.class);
		List<EmployeeInfo> empList=query.getResultList();
		return empList;
	}

	@Override
	public EmployeeInfo getEmployeeInfoById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmployeeInfo(EmployeeInfo empInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeInfoById(int empId) {
		// TODO Auto-generated method stub
		
	}

}
