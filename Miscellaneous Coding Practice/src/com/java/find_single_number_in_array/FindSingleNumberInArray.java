package com.java.find_single_number_in_array;

import java.util.Arrays;

/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * 
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * 
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 * 
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 * 
 */

class SingleNumberArraySolution {
	public int singleNumber(int[] nums) {

		System.out.println(Arrays.toString(nums));
		// ----------------------------------------
		// Sorting the given array
		// ----------------------------------------
		Arrays.parallelSort(nums);
		System.out.println(Arrays.toString(nums));
		// ----------------------------------------

		int x = 0;

		for (int i = 0; i < nums.length; i++) {
			if (i < (nums.length - 1)) {
				if (nums[i] != nums[i + 1]) {
					x = nums[i];
					break;
				}
				// if number is not found at first index then skipping the next index as the
				// next index will contains the duplicate
				i++;
			} else {
				// if the single number found at the end index
				x = nums[i];
			}
		}
		return x;
	}
}

public class FindSingleNumberInArray {

	public static void main(String[] args) {

		int[] nums = { 4, 1, 2, 1, 2 };

		SingleNumberArraySolution singleNumberArray = new SingleNumberArraySolution();
		System.out.println(singleNumberArray.singleNumber(nums));

	}

}
