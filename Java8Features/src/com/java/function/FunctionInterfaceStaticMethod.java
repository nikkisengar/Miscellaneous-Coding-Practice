package com.java.function;

import java.util.function.Function;

public class FunctionInterfaceStaticMethod {

	public static void main(String[] args) {
		
		Function<String, String> f=Function.identity();
		
		String str=f.apply("Durga");
		
		System.out.println(str);

	}

}
