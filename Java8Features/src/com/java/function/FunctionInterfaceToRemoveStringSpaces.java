package com.java.function;

import java.util.function.Function;

public class FunctionInterfaceToRemoveStringSpaces {

	public static void main(String[] args) {
		
		Function<String, String> f=s->s.replaceAll(" ","");
		
		System.out.println(f.apply("Durga Software Solutions Hyderabad"));

	}

}
