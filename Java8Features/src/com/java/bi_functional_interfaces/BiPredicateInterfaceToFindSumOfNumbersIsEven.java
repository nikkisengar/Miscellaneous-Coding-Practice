package com.java.bi_functional_interfaces;

import java.util.function.BiPredicate;

public class BiPredicateInterfaceToFindSumOfNumbersIsEven {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bp=(a,b)->(a+b)%2==0;
		
		System.out.println(bp.test(10, 20));
		System.out.println(bp.test(15, 20));
	}
}
