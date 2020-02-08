package com.java.function;

import java.util.function.Function;

public class FunctionInterfaceToFindStringLength {

	public static void main(String[] args) {
		
		Function<String, Integer> f=s->s.length();
		
		System.out.println(f.apply("Nikhil"));
		
		System.out.println(f.apply("durgasoft"));
	}
}
