package com.java.collection_overview;

import java.util.TreeMap;

public class TreeMapDefaultSortingOrder {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		
		tm.put(100, "Durga");
		tm.put(600, "Sunny");
		tm.put(300, "Bunny");
		tm.put(200, "Chinny");
		tm.put(700, "Vinny");
		tm.put(400, "Pinny");
		
		System.out.println("TreeMap Default Sorting Order according to Key(Ascending): "+tm);

	}

}
