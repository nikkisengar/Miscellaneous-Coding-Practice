package com.java.hibernate.mapping_relations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingRelationTest {

	public static void main(String[] args) {
		
		Laptop laptop=new Laptop();
		laptop.setLaptopId(1);
		laptop.setLaptopName("MacBook");
		
		StudentInfo studentInfo=new StudentInfo();
		studentInfo.setStudRollNo(101);
		studentInfo.setStudName("Rahul");
		studentInfo.setStudMarks(80);
		studentInfo.getLaptop().add(laptop);
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(StudentInfo.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(laptop);
		session.save(studentInfo);
		tx.commit();
	}
}
