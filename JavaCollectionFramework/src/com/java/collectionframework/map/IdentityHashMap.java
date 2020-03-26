package com.java.collectionframework.map;

import java.util.HashMap;

public class IdentityHashMap {

	public static void main(String[] args) {

		// When we are using the HashMap, JVM internally calls .equals() method to check
		// for the duplicate I1.equals(I2) it will return true which means that hashMap
		// contains duplicate but if we that .equals() method should not execute as I1
		// and I2 does not refer to same object. I1 ---> [10] and I2 ---> [10], in that
		// case we have to use IdentityHashMap because when we use IdentityHashMap, JVM
		// internally calls (==) operator (i.e) (I1 == I2) will return false, Hence
		// IdentityHashMap does not contains duplicate
		
		/*
		 * 
		 * HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		 * Integer I1 = new Integer(10);
		 * Integer I2 = new Integer(10);
		 * hashMap.put(I1, "Pawan");
		 * hashMap.put(I2, "Kalyan");
		 * System.out.println("HashMap: " + hashMap);
		 * 
		 */
		
		java.util.IdentityHashMap<Integer, String> identityHashMap = new java.util.IdentityHashMap<Integer, String>();
		
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		
		identityHashMap.put(I1, "Pawan");
		identityHashMap.put(I2, "Kalyan");
		
		System.out.println("IdentityHashMap: " + identityHashMap);
		
	}

}
