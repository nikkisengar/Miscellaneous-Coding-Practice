package com.java.palindrome;

// Palindrome Program

//https://github.com/nikkisengar/Miscellaneous-Coding-Practice.git
public class PalindromeTest {

	public static boolean checkPalindrome(String inputString) {
		
		//taking an empty string to store the reverse of the input String.
		String reverseString = "";
		
		//Constraints
		if(inputString.length()>=1 && inputString.length()<=Math.pow(10, 5)) {
			
			
			for(int i=(inputString.length()-1); i>=0; i--) {
				
				//Reversing the input string and storing it into the reverseString variable
				reverseString = reverseString +inputString.charAt(i);
			}
		}
		
		//checking if the inputString and the reverseString are equal or not
		return (inputString.equals(reverseString));
	}
	
	public static void main(String[] args) {
		
		String inputString = "aabaa";
		System.out.println("Is inputString Palindrome: "+checkPalindrome(inputString));
	}
}
