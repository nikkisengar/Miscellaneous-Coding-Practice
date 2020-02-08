package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Requirement:
 * Take an ArrayList, add some elements now filter the elements with the even numbers and then store those even number in the new List*/
public class StreamsConceptDemo {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(20);
		l.add(5);
		l.add(15);
		l.add(25);
		
		//here the elements will be displayed same as we inserted because in ArrayList insertion order is preserved.
		System.out.println("Elements in list l: "+l);
		
		List<Integer> l1=l.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println("Elements in list l1: "+l1);

	}

}
