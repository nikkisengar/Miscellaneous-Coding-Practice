package com.java.predicate;

import java.util.function.Predicate;

class SoftwareEngineer1 {
	private String name;
	private int age;
	private boolean isHavingGirlFriend;

	// Setters and Getters 
	public String getName() {
		return name;
	} 
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHavingGirlFriend() {
		return isHavingGirlFriend;
	}

	public void setHavingGirlFriend(boolean isHavingGirlFriend) {
		this.isHavingGirlFriend = isHavingGirlFriend;
	}

	// overriding toString() method

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", age=" + age + ", isHavingGirlFriend=" + isHavingGirlFriend + "]";
	}

}

public class PredicateToCheckIfSoftwareEngineerIsAllowedInPub {

	public static void main(String[] args) {

		SoftwareEngineer1 nikhil=new SoftwareEngineer1();
		SoftwareEngineer1 rahul=new SoftwareEngineer1();
		SoftwareEngineer1 kunal=new SoftwareEngineer1();
		SoftwareEngineer1 sanjay=new SoftwareEngineer1();
		
		nikhil.setName("Nikhil");
		nikhil.setAge(26);
		nikhil.setHavingGirlFriend(false);
		
		rahul.setName("Rahul");
		rahul.setAge(27);
		rahul.setHavingGirlFriend(true);
		
		kunal.setName("Kunal");
		kunal.setAge(27);
		kunal.setHavingGirlFriend(true);
		
		sanjay.setName("Sanjay");
		sanjay.setAge(27);
		sanjay.setHavingGirlFriend(true);
		
		SoftwareEngineer1[] list = new SoftwareEngineer1[4];

		list[0]=nikhil;
		list[1]=rahul;
		list[2]=kunal;
		list[3]=sanjay;
		
		Predicate<SoftwareEngineer1> allowed = se -> se.getAge() >= 18 && se.isHavingGirlFriend() == true;

		for (SoftwareEngineer1 se : list) {

			if (allowed.test(se)) {
				System.out.println(se);
			}
		}
	}
}
