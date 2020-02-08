package com.java.predicate;

import java.util.function.Predicate;

public class PredicateCheckingStringLength {

	public static void main(String[] args) {
		
		Predicate<String> p=s->s.length() >5;
		
		System.out.println(p.test("DurgaSir"));

	}

}
