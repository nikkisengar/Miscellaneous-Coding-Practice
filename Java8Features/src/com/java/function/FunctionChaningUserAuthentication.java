package com.java.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChaningUserAuthentication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String userName=sc.next();
		
		System.out.println("Enter Password: ");
		String userPwd=sc.next();
		
		Function<String, String> f1=s->s.substring(0, 5);
		Function<String, String> f2=s->s.toLowerCase();
		
		if(f1.andThen(f2).apply(userName).equals("durga") && userPwd.equals("java")) {
			System.out.println("\nWelcome, thank you for your visit...");
		}
		else {
			System.out.println("Invalid user, please try again...");
		}
		sc.close();
		
	}

}
