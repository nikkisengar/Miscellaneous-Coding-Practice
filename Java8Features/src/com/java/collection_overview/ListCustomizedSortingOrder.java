package com.java.collection_overview;

import java.util.ArrayList;
import java.util.Collections;

public class ListCustomizedSortingOrder {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(4);
		System.out.println("Before Sorting: "+l);
		
		//Using Comparator implemented class to use our own Sorting order
		Collections.sort(l, new  MyComparator());
		System.out.println("After Sorting: "+l);//Descending order
	}
}
