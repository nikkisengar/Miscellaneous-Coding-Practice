package com.java.collectionframework.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();

		m.put("Chiranjeevi", 700);
		m.put("Balaiah", 800);
		m.put("Venkatesh", 200);
		m.put("Nagarjuna", 500);

		// In HashMap Insertion order is not preserved
		System.out.println("Initial HashMap: " + m);

		// changing the value of a key
		System.out.println("Changing the value of key will return old value: " + m.put("Chiranjeevi", 1000));

		// Getting the set of Keys and Values
		Set<String> s = m.keySet();
		System.out.println("All Keys inside HashMap are: " + s);

		Collection<Integer> c = m.values();
		System.out.println("All Values inside HashMap are: " + c);

		// Getting all the Entry (Combination of Key-Value pair is called Entry)
		Set<Entry<String, Integer>> s1 = m.entrySet();

		System.out.println("All Entry are: " + s1);

		// traversing through Set using Iterator cursor
		Iterator<Entry<String, Integer>> itr = s1.iterator();

		System.out.println("Each Entry inside a Map: ");

		while (itr.hasNext()) {

			// Using Map.Entry interface to traverse through each Entry object
			Map.Entry<String, Integer> m1 = (Entry<String, Integer>) itr.next();

			System.out.println(m1.getKey() + "<--->" + m1.getValue());

			if (m1.getKey().equals("Nagarjuna")) {
				m1.setValue(10000);
			}
		}
		System.out.println("Final HashMap: " + m);
	}

}
