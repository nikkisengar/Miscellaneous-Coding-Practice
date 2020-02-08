package com.java.predicate;

import java.util.function.Predicate;

public class PredicateJoiningDemo {

	public static void main(String[] args) {
		
		//array of integers
		int[] x= {0,5,10,15,20,20,25,30};
		
		//Predicate checking if a given number is greater then 10 or not
		Predicate<Integer> p1=i->i>10;
		//Predicate checking if a given number is even or not
		Predicate<Integer> p2=i->i%2==0;
		
		System.out.println("The numbers greater then 10 are: ");
		m1(p1, x);
		
		System.out.println("The even numbers are: ");
		m1(p2, x);
		
		System.out.println("The numbers not greater then 10: ");
		m1(p1.negate(), x);
		
		System.out.println("The numbers greater then 10 and are even numbers: ");
		m1(p1.and(p2), x);
		
		System.out.println("The numbers greater then 10 or they are Even numbers: ");
		m1(p1.or(p2), x);
	}
	
	public static void m1(Predicate<Integer> p,int[] x) {
		for(int x1:x) {
			if(p.test(x1))
				System.out.print(x1+" ");
		}
		System.out.println("\n");
	}
}
