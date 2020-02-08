package com.java.predicate;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		
		//using Predicate functional interface
		Predicate<Integer> p = I -> I>10;
		
		System.out.println("Is 100 > 10: "+p.test(100));
		System.out.println("Is 5 > 10: "+p.test(5));
		//System.out.println("Is 5 > 10: "+p.test(true));
	}

}
