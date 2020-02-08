package com.java.century_from_year;


/*
 * Given a year, return the century it is in. 
 * The first century spans from the year 1 up to and including the year 100,
 * the second - from the year 101 up to and including the year 200, etc.

 *	Example
	
 *  For year = 1905, the output should be
 *  centuryFromYear(year) = 20;
	
 *	For year = 1700, the output should be
 *	centuryFromYear(year) = 17.

*/

public class CenturyFromYear {

	public static void main(String[] args) {
		System.out.println("The Century from the given year is: "+centuryFromYear(1905));
	}

	private static int centuryFromYear(int year) {
		
		//Checking the condition that the year should be between (1,2005)
		if(year>=1 && year<=2005 && year%100==0) {
			
			//if year%100 is 0 then return the year/100
			return (year/100);
		}else {
			
			//if (year % 100) is not 0 then return ((year/100 + 1)
			return ((year/100)+1);
		}
	}
}
