package com.java.function;

import java.util.function.Function;

public class FunctionInterfaceToFindStringSpaceCount {

	public static void main(String[] args) {
		
		//String Space Count = String with Spaces - String without Spaces.
		
		Function<String , Integer> f=s->s.length() - s.replaceAll(" ", "").length();
		
		System.out.println("String Count: "+f.apply("Durga Software Solution Hyderabad"));

	}

}
