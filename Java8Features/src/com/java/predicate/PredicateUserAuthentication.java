package com.java.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	
	private String userName;
	private String pwd;
	
	
	//Getters and setters
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}

public class PredicateUserAuthentication {

	public static void main(String[] args) {
		
		Predicate<User> p=user->user.getUserName().equals("nikkisengar") && user.getPwd().equals("java8");
		
		//For taking the inputs from the user dynamically Scanner class is the best choice
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String userName=sc.next();
		
		System.out.println("Enter Password: ");
		String pwd=sc.next();
		
		//creating User class object to assign the values
		User user=new User();
		user.setUserName(userName);
		user.setPwd(pwd);
		
		//Checking if the given userName and the password is correct or not
		if(p.test(user)) {
			System.out.println("Welcome, nice to see you...");
		}
		else {
			System.out.println("Invalid user, please try again...");
		}
		
		sc.close();
	}
}
