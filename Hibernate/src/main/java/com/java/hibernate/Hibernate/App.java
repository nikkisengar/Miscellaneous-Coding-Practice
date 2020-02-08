package com.java.hibernate.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//Creating NameDetails class object to embed inside the student class with out creating extra table
    	NameDetails name=new NameDetails();
    	name.setFirstName("Kunal");
    	name.setMiddleName("");
    	name.setLastName("Kashyap");
    	
    	Student student=new Student();
    	
    	student.setStudRollNo(1);
    	student.setNameDetails(name);
    	student.setStudSubject("Scala");
    	student.setStudInstitute("Infosys");
    	
    	//Creating Configuration object to get the SessionFactory object
    	//configure() we use this method to say that we have an XML configuration class where the properties is defined.
    	//addAnnotatedClass() method is used to say that this is the class we have to work with in order to persist the data	
    	Configuration config=new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	//Getting SessionFactory object using Configuration class object in order to create the Session object.
    	//Note that SessionFactory is an Interface
    	//buildSessionFactory() method is a Factory Method that is used to get the object of Session Interface
    	SessionFactory sf=config.buildSessionFactory();
    	
    	//Previously in the version 4.x the method buildSessionFactory() was deprecated, so by using the below lines of code it would be resolved:
    	//ServiceRegistry reg=new ServiceRegisteryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	// SessionFactory sf=config.buildSessionFactory(reg);
    	
    	//Getting the Session object in order to persist the data into the database.
    	//Note that Session is an Interface
    	Session session=sf.openSession();
    	
    	
    	//When we say that we are storing the data into the database, that mean we are making changes to the database. 
    	//When we do changes to the database then we should follow the ACID (Atomicity, Consistency, Isolation, and Durability) properties, 
    	//To follow the ACID properties any changes to the database must be a part of a Transaction. 
    	Transaction tx=session.beginTransaction();
    	
    	//save() method in Session interface will save or update the data which you will pass as an argument in your database
    	session.save(student);
    	
    	student=(Student)session.get(Student.class, 1);
    	
    	tx.commit();
    	
        System.out.println( "The Student details are: "+student );
    }
}
