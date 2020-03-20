package com.java.collectionframework;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorImpl {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		Enumeration<Integer> e = v.elements();

		Iterator<Integer> itr = v.iterator();

		ListIterator<Integer> litr = v.listIterator();
		
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());

	}

}
