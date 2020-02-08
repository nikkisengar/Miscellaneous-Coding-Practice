package com.java.primitive_type_functional_interface;

import java.util.function.ToIntFunction;

public class ToIntFunctionToFindLengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToIntFunction<String> f=s->s.length();
		System.out.println(f.applyAsInt("Durga"));
	}

}
