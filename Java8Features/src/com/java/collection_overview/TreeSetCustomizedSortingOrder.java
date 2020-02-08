package com.java.collection_overview;

import java.util.TreeSet;

public class TreeSetCustomizedSortingOrder {

	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>(
				(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0
				);
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(25);
		t.add(5);
		t.add(20);
		
		System.out.println("TreeSet Customized Sorting Order(Descending): "+t);

	}

}
