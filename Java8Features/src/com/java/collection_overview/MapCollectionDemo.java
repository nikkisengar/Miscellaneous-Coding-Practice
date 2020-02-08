package com.java.collection_overview;

import java.util.HashMap;

public class MapCollectionDemo {

	public static void main(String[] args) {
		
		HashMap<String, String> m=new HashMap<String, String>();
		m.put("A", "Apple");
		m.put("Z", "Zebra");
		m.put("Durga", "Java");
		m.put("B", "Ball");
		m.put("C", "Cat");
		m.put("A", "Asuran");
		m.put("A", "Anil");
		
		System.out.println(m);
	}
}
