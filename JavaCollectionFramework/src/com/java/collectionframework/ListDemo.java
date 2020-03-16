package com.java.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		/*List<String> lst = new ArrayList<String>();
		lst.add("Mercury");
		lst.add("Venus");
		lst.add("Earth");
		lst.add("JavaSoft");
		lst.add("Mars");
		lst.add("Jupiter");
		lst.add("Saturn");
		lst.add("Uranus");
		lst.add("Neptune");
		lst.add("Pluto");

		System.out.println("Planets Name: "+lst);*/
		
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new ArrayList<Integer>();
		
		//add(-) method
		list.add(97);
		list.add(20);
		list.add(136);
		list.add(89);
		list.add(90);
		list.add(56);
		list.add(55);
		list.add(35);
		list.add(100);
		
		System.out.println("Original list: "+list);
		
		//addAll(-) method
		list1.addAll(list);
		System.out.println("Original list1: "+list);
		for (int i:list) {
			if(i%2==0)
				System.out.print(i+"  ");
		}
		System.out.println();
		//contains(-) method
		System.out.println("Is 100 in the list: "+list.contains(100));
		System.out.println("Is 100 in the list1: "+list.contains(100));
		System.out.println("Size of list: "+list.size());
		System.out.println("Size of list1: "+list.size());
		System.out.println("Is list1 contains list: "+list1.containsAll(list));
		
		list.forEach(l->System.out.print(l+" "));
		System.out.println();
		list1.clear();
		System.out.println(list1.contains(90));
		System.out.println(list.get(0));
		System.out.println(list.indexOf(90));
		System.out.println(list1.isEmpty());
		System.out.println(list.lastIndexOf(55));
		list.removeAll(list1);
		System.out.println(list.remove(2));
		System.out.println(list.remove(20));
		
		
		
	}
}