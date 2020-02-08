package com.java.collection_overview;

import java.util.HashSet;

public class SetCollectionDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Sunny");
		hs.add("Bunny");
		hs.add("Chinny");
		hs.add("Munny");
		hs.add("Sunny");
		
		System.out.println(hs);
	}
}
