package com.java.primitive_type_functional_interface;

import java.util.function.Predicate;

public class PredicateToFindNumberInAnArrayIsEven {

	public static void main(String[] args) {

		int[] numArray= {23,45,64,67,78};
		
		Predicate<Integer> p=i->i%2==0;
		
		System.out.println("Even Numbers are: ");
		for(int i:numArray) {
			if(p.test(i))
				System.out.println(i);
		}

	}

}
