package com.java.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();

		System.out.println(vector.capacity());

		for (int i = 1; i <= 10; i++) {
			vector.addElement(i);
		}

		System.out.println(vector.capacity());

		vector.addElement(13);
		System.out.println(vector.capacity());
		System.out.println(vector);
		
		List<String> names=new ArrayList<String>();
		Collections.addAll(names, "A","B","C","D","E","F","G","H","I","J");
		Vector<String> v=new Vector<String>(10,3);
		Collections.addAll(v, "A","B","C","D","E","F","G","H","I","J");
		System.out.println("Capacity of v: "+v.capacity());
		v.add("K");
		System.out.println("new vector: "+v);
		System.out.println("New Capacity of v: "+v.capacity());
		System.out.println(v.size());
		
		//Vector<String> 

	}

}
