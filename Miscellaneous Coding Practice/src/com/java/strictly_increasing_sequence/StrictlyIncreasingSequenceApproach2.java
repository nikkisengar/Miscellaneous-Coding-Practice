package com.java.strictly_increasing_sequence;

public class StrictlyIncreasingSequenceApproach2 {

	public static boolean isStrictlyIncreasingSequence(int[] sequence) {
		boolean noFailuresYet = true;
	    for(int i = 0; i < sequence.length-1; i++) {
	        if(sequence[i] >= sequence[i+1]) {
	            if(noFailuresYet) {
	                if(i != 0 && i != sequence.length-2) {
	                    if(sequence[i+1] <= sequence[i-1]) {
	                        //Here we run the next iteration of the loop manually
	                        //Alternatively we could set sequence[i] = sequence[i-1]
	                        //but I don't want to modify the input array
	                        //in case this function were to get used to check something elsewhere
	                        if(sequence[i+2] <= sequence[i]) {
	                            return false;
	                        }
	                        i++;
	                    }
	                }
	                noFailuresYet = false;
	            } else {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		
		int[] sequence = { 6, 5, 67, 98, 3 };

		System.out.println(isStrictlyIncreasingSequence(sequence));
	}

}
