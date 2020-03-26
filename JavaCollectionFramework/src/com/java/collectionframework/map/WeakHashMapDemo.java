package com.java.collectionframework.map;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp {

	@Override
	public String toString() {
		return "temp";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize() method called");
	}
}

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * When we use HashMap with which an object is associated then even if we
		 * nullify that object it will not be eligible for garbage collection until the
		 * Object is associated with HashMap.
		 * 
		 * HashMap dominates garbage collection(gc)
		 * 
		 * If we want that when we nullify the Object then it should be eligible for
		 * garbage collection even if it is associated with Map Object then we must use
		 * WeakHashMap
		 * 
		 * garbage collection(gc) dominates WeakHashMap 
		 * 
		 */

		/*
		HashMap<Temp, String> hashMap = new HashMap<Temp, String>();
		Temp temp = new Temp();
		hashMap.put(temp, "Nikhil");
		System.out.println("HashMap: " + hashMap);

		// nullifying the Temp Object which indicates that Temp object is now eligible
		// for garbage collection (GC)
		temp = null;

		// Calling garbage collector thinking that Temp object is eligible for garbage
		// collection which means that our overridden finalize() method will be called
		System.gc();

		// If finalize() method didn't run then may be after 5 seconds it will run so
		// making the main thread sleeping for 5 seconds
		Thread.sleep(5000);

		// Here we see that the Temp object is not destroyed by gc(); as finalize()
		// method didn't called
		System.out.println("HashMap after nullifying the Temp object: " + hashMap);
		*/
		
		WeakHashMap<Temp, String> weakHashMap = new WeakHashMap<Temp, String>();
		Temp temp = new Temp();
		
		weakHashMap.put(temp, "Nikhil");
		
		System.out.println("WeakHashMap: " + weakHashMap);
		
		temp = null;
		
		System.gc();// it should call our overridden finalize() method in Temp class after the main method is completed
		
		System.out.println("WeakHashMap after nullifying the Temp object: " + weakHashMap);
		
	}

}
