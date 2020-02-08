package com.java.predicate;

import java.util.function.Predicate;

public class PredicateNameStartsWithK {

	public static void main(String[] args) {
		
		
		//String array
		String[] strArr= {"Sunny","Kajol","Mallika","Katrina","Kareena"};
		
		Predicate<String> startsWithK=s->s.charAt(0)=='K';
		
		System.out.println("Names starting with K are: ");
		for(String s:strArr) {
			if(startsWithK.test(s)) {
				System.out.println(s);
			}
		}
		

	}

}
