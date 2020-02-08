package com.java.predicate;

import java.util.function.Predicate;

class SoftwareEngineer{
	String name;
	int age;
	boolean isHavingGirlFriend;
	
	public SoftwareEngineer(String name, int age, boolean isHavingGirlFriend) {
		super();
		this.name = name;
		this.age = age;
		this.isHavingGirlFriend = isHavingGirlFriend;
	}
	
	public String toString() {
		return name;
	}
}

public class PredicateSoftwareEngineer {

	public static void main(String[] args) {


		SoftwareEngineer[] list= {
				new SoftwareEngineer("Nikhil", 26, false),
				new SoftwareEngineer("Rahul",19,true),
				new SoftwareEngineer("Kunal", 20, false),
				new SoftwareEngineer("Sanjay", 21, false)
		};
		
		Predicate<SoftwareEngineer> allowed=se->se.age>=18 && se.isHavingGirlFriend;
		
		for(SoftwareEngineer se: list) {
			if(allowed.test(se))
				System.out.println(se);
		}

	}

}
