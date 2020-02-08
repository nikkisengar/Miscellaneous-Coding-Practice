package com.java.century_from_year;

public class CenturyFromYear {

	public static void main(String[] args) {
		System.out.println("The Century from the given year is: "+centuryFromYear(1905));
	}

	private static int centuryFromYear(int year) {
		
		if(year>=1 && year<=2005 && year%100==0) {
			return (year/100);
		}else {
			return ((year/100)+1);
		}
	}
}
