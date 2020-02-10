package com.java.n_interesting_polygon;

import java.util.Scanner;

/* Below we will define an n-interesting polygon. 
 * Your task is to find the area of a polygon for a given n.
 * A 1-interesting polygon is just a square with a side of length 1.
 * An n-interesting polygon is obtained by taking the n - 1-interesting polygon 
 * and appending 1-interesting polygons to its rim, side by side. 
 * You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
 
   Example:
   
 * For n = 1, the output should be shapeArea(n) = 1 because we have only 1 square;
 * For n = 2, the output should be shapeArea(n) = 5 because we have only 5 square;
 * For n = 3, the output should be shapeArea(n) = 13 because we have only 13 square;
 * For n = 5, the output should be shapeArea(n) = 13 because we have only 25 square;
 
   Input/Output:
   
 * [execution time limit] 3 seconds (java)

 * [input] integer n

 * Guaranteed constraints: 1 ≤ n < 104.
 */

public class NInterestingPolygon {

	public static int nInterestingPolygonArea(int valueOfN) {
		
		if(valueOfN>=1 && valueOfN<=Math.pow(10, 4)) {
			
			return ((valueOfN * valueOfN) + (valueOfN-1) * (valueOfN -1)); 
		}
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		//Best option to take input form the user is to use Scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		//Taking the value of n
		int valueOfN=sc.nextInt();
		
		//displaying the area of N-Interesting Polygon
		System.out.println("Area of "+valueOfN+"-Interesting Polygon is: "+nInterestingPolygonArea(valueOfN));
	}
}
