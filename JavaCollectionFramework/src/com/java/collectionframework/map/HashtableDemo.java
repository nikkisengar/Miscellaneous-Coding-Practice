package com.java.collectionframework.map;

import java.util.Hashtable;

class Temp1 {
	int i;

	public Temp1(int i) {
		this.i = i;
	}

	@Override
	public int hashCode() {
		//return i % 9;
		return i;
	}

	@Override
	public String toString() {
		return i + "";
	}
}

public class HashtableDemo {

	public static void main(String[] args) {

		/*
		 * Creates a Hashtable with the default initial capacity=11 and fill ration=0.75
		 */
		/*
		 * Hashtable<Temp1, String> h = new Hashtable<Temp1, String>();
		 

		h.put(new Temp1(34), "A");
		h.put(new Temp1(56), "B");
		h.put(new Temp1(23), "C");
		h.put(new Temp1(29), "D");
		h.put(new Temp1(11), "E");
		h.put(new Temp1(17), "F");
		h.put(new Temp1(15), "G");
		h.put(new Temp1(37), "H");

		System.out.println("Hashtable with default initial capacity=11: \n" + h);
		*/
		
		/*
		 * Creates a Hashtable with our own specified initial capacity=25 and fill ration=0.75
		 */
		
		Hashtable<Temp1, String> h=new Hashtable<Temp1, String>(25);
		h.put(new Temp1(34), "A");
		h.put(new Temp1(56), "B");
		h.put(new Temp1(23), "C");
		h.put(new Temp1(29), "D");
		h.put(new Temp1(11), "E");
		h.put(new Temp1(17), "F");
		h.put(new Temp1(15), "G");
		h.put(new Temp1(37), "H");

		System.out.println("Hashtable with initial capacity=25: \n" + h);
	}

}
