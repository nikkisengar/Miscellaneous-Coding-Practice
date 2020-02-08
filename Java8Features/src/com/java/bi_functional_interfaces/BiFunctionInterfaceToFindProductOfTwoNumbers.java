package com.java.bi_functional_interfaces;

import java.util.function.BiFunction;

public class BiFunctionInterfaceToFindProductOfTwoNumbers {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bf=(a,b)->a*b;
		
		System.out.println(bf.apply(57,34));
		System.out.println(bf.apply(23, 47));

	}

}
