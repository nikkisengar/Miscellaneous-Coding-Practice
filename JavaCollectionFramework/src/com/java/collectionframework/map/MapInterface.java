package com.java.collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {

		Map<Integer, String> stud = new HashMap<Integer, String>();
		
		//
		stud.put(1, "A");
		stud.put(1, "B");
		stud.put(null, "C");
		stud.put(1, "D");
		
		System.out.println("HashMap: "+stud);

	}

}
