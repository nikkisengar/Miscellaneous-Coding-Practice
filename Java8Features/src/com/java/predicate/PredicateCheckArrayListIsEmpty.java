package com.java.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateCheckArrayListIsEmpty {

	public static void main(String[] args) {
		
		Predicate<Collection<Integer>> p=c->c.isEmpty();

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		
		System.out.println("Is ArrayList al Empty: "+p.test(al));
		
		ArrayList<Integer> alInt=new ArrayList<Integer>();
		
		System.out.println("Is ArrayList alInt Empty: "+p.test(alInt));
	}

}
