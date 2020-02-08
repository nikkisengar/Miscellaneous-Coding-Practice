package com.java.supplier;

import java.util.function.Supplier;

public class SupplierInterfaceToGetRandomPassword {

	public static void main(String[] args) {
		
		Supplier<String> supplierForRandomPassword=()->{
			
			String randomPassword="";
			
			Supplier<Integer> randomDigits=()->(int)(Math.random()*10);
			
			String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";//String has 29 character
			
			Supplier<Character> randomsymbols=()->symbols.charAt((int)(Math.random()*29));
			
			for(int i=0;i<8;i++) {
				if(i%2==0)
					randomPassword=randomPassword+randomDigits.get();
				else
					randomPassword=randomPassword+randomsymbols.get();
			}
			
			return randomPassword;
		};
		System.out.println("Random 8 character passwords: \n"+supplierForRandomPassword.get());
	}

}
