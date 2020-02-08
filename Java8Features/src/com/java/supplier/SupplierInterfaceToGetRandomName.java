package com.java.supplier;

import java.util.function.Supplier;

public class SupplierInterfaceToGetRandomName {

	public static void main(String[] args) {
		
		Supplier<String> s=()->{
			String[] str= {"Sunny","Bunny","Nani","Chinny"};
			
			int x=(int) (Math.random() * 4);
			
			return str[x];
		};
		
		System.out.println("Random Names are: \n"+s.get());
		System.out.println(s.get());
	}
}
