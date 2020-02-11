package com.java.strictly_increasing_sequence;

public class StrictlyIncreasingSequence {

	public static boolean strictlyIncreasingSequence(int[] sequence) {

		boolean isIncreasingSequence = false;
		
		//temp variable to store the number of times the elements are removed to check the strictly increasing sequence.
		int temp = 0;

		//newArray to store the remaining elements after removing one element from the sequence array.
		int[] newArray = new int[sequence.length - 1];

		//check if the input array contains only 2 elements and by removing any one of them will give increase sequence always.
		if (sequence.length <= 2)
			
			//marking isIncreasingSequence=true when the input array contains only 2 elements.
			isIncreasingSequence = true;
		
		//if the input array contains more than two elements 
		else
			//for loop to remove one element each time until the input array size is reached.
			for (; temp < sequence.length;) {
				
				//traversing through the input array
				for (int i = 0, k = 0; i < sequence.length; i++) {
					
					//removing the elements as value of temp increases.
					if (i == temp)
						continue;

					//if the end of input array is reached then increase the temp value to remove the next element.
					if (i == sequence.length - 1)
						temp++;

					//adding the remaining elements in the new array.
					newArray[k++] = sequence[i];
				}

				
				//traversing through newArray.
				for (int j = 0; j < newArray.length - 1; j++) {

					//now checking the new array if it contains the strictly increasing elements.
					if (newArray[j + 1] > newArray[j]) {
						isIncreasingSequence = true;
						continue;
					} 
					//if the new array do not contain the strictly increasing elements then set isIncreasingSequence=false and exit from the loop to check the next sequence.
					else {
						isIncreasingSequence = false;
						break;
					}
				}
				
				//if all the elements in the newArray is strictly increasing sequence then exit from the outer loop and return the value. 
				if (isIncreasingSequence) {
					break;
				}
			}

		return isIncreasingSequence;
	}

	public static void main(String[] args) {

		int[] sequence = { 3, 5, 67, 98, 3 };

		System.out.println(strictlyIncreasingSequence(sequence));

	}

}
