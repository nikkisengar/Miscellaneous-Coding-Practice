package com.java.collectionframework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ListExtendsClonableAndSerializableAndRandomAccess {

	public static void main(String[] args) {

		ArrayList<String> l1 = new ArrayList<String>();

		LinkedList<String> l2 = new LinkedList<String>();

		// ArrayList implements Cloneable, Serializable, and RandomAccess interface
		// LinkedList implements Cloneable, Serializable interfaces but not RandomAccess interface
		
		System.out.println("l1 instanceof Cloneable: ");
		System.out.println(l1 instanceof Cloneable);
		System.out.println("l1 instanceof RandomAccess: ");
		System.out.println(l1 instanceof RandomAccess);
		System.out.println("l1 instanceof Serializable: ");
		System.out.println(l1 instanceof Serializable);
		System.out.println("\n");
		System.out.println("l2 instanceof Cloneable: ");
		System.out.println(l2 instanceof Cloneable);
		System.out.println("l2 instanceof RandomAccess: ");
		System.out.println(l2 instanceof RandomAccess);
		System.out.println("l2 instanceof Serializable: ");
		System.out.println(l2 instanceof Serializable);

	}

}
