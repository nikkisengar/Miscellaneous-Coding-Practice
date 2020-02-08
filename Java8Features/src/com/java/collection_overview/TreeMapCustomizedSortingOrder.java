package com.java.collection_overview;

import java.util.TreeMap;

public class TreeMapCustomizedSortingOrder {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>(
				(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0
				);
		
		tm.put(100, "Durga");
		tm.put(600, "Sunny");
		tm.put(300, "Bunny");
		tm.put(200, "Chinny");
		tm.put(700, "Vinny");
		tm.put(400, "Pinny");
		
		System.out.println("TreeMap Customised Sorting Order according to Key (Descending): "+tm);

	}
}
