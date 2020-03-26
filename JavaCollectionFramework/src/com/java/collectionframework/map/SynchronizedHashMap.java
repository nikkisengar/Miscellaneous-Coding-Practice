package com.java.collectionframework.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SynchronizedHashMap {

	public static void main(String[] args) {

		//System.out.println(Thread.currentThread().getName());

		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(101, "Z");
		m.put(103, "B");
		m.put(102, "K");
		m.put(105, "D");

		Map<Integer, String> m1 = Collections.synchronizedMap(m);

		System.out.println("Executed by Thread " + Thread.currentThread().getName() + ": " + m1);

		Set<Entry<Integer, String>> s = m1.entrySet();

		Iterator<Entry<Integer, String>> itr = s.iterator();

		new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
			while (itr.hasNext()) {
				Map.Entry<Integer, String> entry = itr.next();
				if (entry.getKey() == 101) {
					entry.setValue("P");
				}
			}
			System.out.println("Executed by Thread " + Thread.currentThread().getName() + ": " + m1);
		}).start();

		Set<Entry<Integer, String>> s1 = m1.entrySet();

		Iterator<Entry<Integer, String>> itr1 = s1.iterator();

		new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
			while (itr1.hasNext()) {
				Map.Entry<Integer, String> entry1 = itr1.next();
				if (entry1.getKey() == 101) {
					entry1.setValue("S");
				}
			}
			System.out.println("Executed by Thread " + Thread.currentThread().getName() + ": " + m1);
		}).start();
	}
}
