package com.java.primitive_type_functional_interface;

import java.util.function.IntPredicate;

public class IntPredicateToFindNumberIsEven {

	public static void main(String[] args) {
		
		int[] numArray= {25,65,78,96,43,24};
		
		IntPredicate p=i->i%2==0;
		
		System.out.println("Evem Number: ");
		for (int i:numArray) {
			if(p.test(i))
				System.out.println(i);
		}

	}

}
