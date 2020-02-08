package com.java.primitive_type_functional_interface;

import java.util.function.IntFunction;

public class IntFunctionToFindSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntFunction<Integer> f=i->i*i;
		System.out.println(f.apply(5));
	}

}
