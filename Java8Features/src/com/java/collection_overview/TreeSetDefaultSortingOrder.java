package com.java.collection_overview;

import java.util.TreeSet;

public class TreeSetDefaultSortingOrder {

	public static void main(String[] args) {
		
		//Using TreeSet no argument constructor will give the default natural sorting order: Ascending order
		TreeSet<Integer> t=new TreeSet<Integer>();
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(25);
		t.add(5);
		t.add(20);
		t.add(10);
		
		System.out.println("TreeSet Default Sorting Order(Ascending): "+t);

	}

}
