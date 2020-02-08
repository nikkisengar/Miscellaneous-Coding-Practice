package com.java.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateRemoveNullAndEmptyStringFromList {

	public static void main(String[] args) {
		
		String[] names= {"Durga","",null,"Ravi","","Shiva",null};
		
		Predicate<String> p=s->s!=null && s.length()!=0;
		
		ArrayList<String> al=new ArrayList<String>();
		
		for(String s: names) {
			if(p.test(s))
				al.add(s);
		}
		System.out.println("List without null and empty String is: ");
		System.out.println(al);

	}

}
