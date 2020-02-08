package com.java.collection_overview;

import java.util.ArrayList;
import java.util.Collections;

public class ListCollectionSorting {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		
		System.out.println("List Before Sorting: "+l);
		
		//Default Natural Sorting order for Numbers is Ascending order, for String is Alphabetical order
		Collections.sort(l);
		System.out.println("List After Sorting: "+l);
	}
}
