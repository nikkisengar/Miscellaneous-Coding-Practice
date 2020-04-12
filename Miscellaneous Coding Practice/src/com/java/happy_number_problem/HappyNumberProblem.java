package com.java.happy_number_problem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Write an algorithm to determine if a number n is "happy".
 * A happy number is a number defined by the following process: 
 * Starting with any positive integer, replace the number by the 
 * sum of the squares of its digits, and repeat the process until the 
 * number equals 1 (where it will stay), or it loops endlessly in a cycle 
 * which does not include 1. Those numbers for which this process 
 * ends in 1 are happy numbers.
 * Return True if n is a happy number, and False if not.
 * 
 * Example:
 * Input: 19
 * Output: true
 * 
 * Explanation:
 * 1*1 + 9*9 = 82
 * 8*8 + 2*2 = 68
 * 6*6 + 8*8 = 100
 * 1*1 + 0*0 + 0*0 = 1
 * 
 */

public class HappyNumberProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		System.out.println("Is entered number a happy number: " + isHappyNumber(n));

		sc.close();
	}

	public static boolean isHappyNumber(int n) {

		int sumOfDigits = 0;
		boolean isTrue = false;
		Set<Integer> unique_num = new HashSet<Integer>();
		unique_num.add(n);
		while (n != 0) {

			// taking the sum of square of each digit in the given number
			sumOfDigits = sumOfDigits + (n % 10) * (n % 10);

			// if square of 1 digit is done then removing it
			n = n / 10;

			// verifying for the happy_number if sum is 1 and the their is no more iteration
			// for the given number (i.e) n=0
			if (sumOfDigits == 1 && n == 0) {
				isTrue = true;
				break;
			}

			// if sum != 1 and still there are iterations left for the given number
			// also storing the all the numbers which is assigned to n in a Set
			// because if a number is not a happy number then after certain iteration sum
			// will match to any of the previous sum and as we know Set does not allow
			// duplicate so in the if condition we specified the condition for adding a sum
			// in the Set. Please note that add(-) method of set will return boolean
			if (n == 0 && unique_num.add(sumOfDigits)) {
				n = sumOfDigits;
				sumOfDigits = 0;

			}

		}
		// System.out.println(unique_num);
		return isTrue;
	}
}
