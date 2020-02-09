package com.java.palindrome;

public class PalindromeTest {

	public static boolean checkPalindrome(String inputString) {
		
		String reverseString = "";
		
		if(inputString.length()>=1 && inputString.length()<=Math.pow(10, 5)) {
			for(int i=(inputString.length()-1); i>=0; i--) {
				reverseString = reverseString +inputString.charAt(i);
			}
		}
		
		return (inputString.equals(reverseString));
	}
	
	public static void main(String[] args) {
		
		String inputString = "aabaa";
		System.out.println("Is inputString Palindrome: "+checkPalindrome(inputString));
		
		

	}

}
