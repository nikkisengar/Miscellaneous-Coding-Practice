package com.java.smallest_positive_number;

import java.util.Arrays;

public class SmallestPositiveNumber {

	public static int smallestPositiveNumber(int[] a) {
		
		int returnValue=0;
		
		//---------------------------------------------------
		System.out.print("Actual Array: ");
		for(int i: a)
			System.out.print(i+" ");//printing actual array
		//---------------------------------------------------
		//sorting the given array(Default Sorting order is Ascending order)
		Arrays.parallelSort(a);
		//---------------------------------------------------
		System.out.print("\nSorted Array: ");
		for(int i:a)
			System.out.print(i+" ");
		//---------------------------------------------------
		System.out.println("\n");
		//---------------------------------------------------
		
		for(int i=0;i<a.length;i++) {
			
			//when all the element of the array are negative then we have to return 1 which will be the smallest positive number greater then zero.
			if(a[i]<=0) {
				if(i==a.length-1)
					returnValue=1;
				else
					continue;
			}
			//when the element in the array is positive and verifying the difference between the current element and the next element.
			else if(a[i]>0 && i<(a.length-1)) { 
				if((a[i+1]-a[i])==1)
					continue;
				else {
					returnValue =(a[i]+1);
					break;
				}
			}
			//this else when we reach at the end of the array because else-if condition will fail when end of array is reached.
			else {
				returnValue= (a[i]+1);
			}
		}
		return returnValue;
	}
	
	public static void main(String[] args) {
		int[] a= {1,3,7,-9,-2};
		System.out.println("Smallest Positive Number is: "+smallestPositiveNumber(a));
	}
}
