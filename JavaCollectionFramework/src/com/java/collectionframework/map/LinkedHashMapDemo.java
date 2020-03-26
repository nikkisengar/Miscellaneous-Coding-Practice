package com.java.collectionframework.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<String, Integer>();

		hashMap.put("Chiranjeevi", 700);
		hashMap.put("Balaiah", 800);
		hashMap.put("Venkatesh", 200);
		hashMap.put("Nagarjuna", 500);

		System.out.println("Initial LinkedHashMap: " + hashMap);

		System.out.println("Chaning the Value will return old value: " + hashMap.put("Chiranjeevi", 1000));

		Set<String> keys = hashMap.keySet();
		System.out.println("All Keys inside LinkedHashMap are: " + keys);

		Collection<Integer> values = hashMap.values();
		System.out.println("All Values inside LinkedHashMap are: " + values);

		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();

		System.out.println("All Entries inside LinkedHashMap are: " + entrySet);

		Iterator<Entry<String, Integer>> itr = entrySet.iterator();

		System.out.println("Individual Entries are: ");

		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() + "<-->" + entry.getValue());
			if (entry.getKey().equals("Venkatesh")) {
				entry.setValue(400);
			}
		}

		System.out.println("Final LinkedHashMap: " + hashMap);

	}

}
