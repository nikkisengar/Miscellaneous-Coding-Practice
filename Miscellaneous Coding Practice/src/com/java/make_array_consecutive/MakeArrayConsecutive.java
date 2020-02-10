package com.java.make_array_consecutive;

import java.util.Arrays;

public class MakeArrayConsecutive {

	public static int makeArrayConsecutive(int[] statues) {
		
		// Variable to store the required number of statues and a variable to store the difference between the adjacent elements
		int requiredNoOfStatues=0, difference=0;
		
		//sorting the array
		Arrays.parallelSort(statues);
		
		for(int i=0; i<statues.length-1; i++) {
			
			difference = (statues[i+1] - statues[i]) - 1;
			
			if(difference>=1) {
				requiredNoOfStatues = requiredNoOfStatues + difference;
			}
		}
		
		return requiredNoOfStatues;
	}
	
	public static void main(String[] args) {
		
		int[] statues= {6, 2, 3, 7};
		System.out.println("Number of additional statues required: "+makeArrayConsecutive(statues));

	}

}
