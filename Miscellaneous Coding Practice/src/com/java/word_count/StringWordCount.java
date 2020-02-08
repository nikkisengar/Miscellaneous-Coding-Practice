package com.java.word_count;

import java.util.ArrayList;
import java.util.Collections;

public class StringWordCount {

    public static int stringCount(String str){
    	//temp variable to store the number of space between the words.
        int temp=0;
        
        //taking the index count of the string 
        int totalIndex=str.length()-1;
        
        //ArrayList to store the total number of words in a sentence
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        for (int i=0; i<=totalIndex; i++) {
        	
        	//Checking for the spaces between the words in a sentence.
            if (str.charAt(i) == ' ') {
            	
            	//whenever we find a space at the index i in a string then storing the space count in temp variable
                temp = temp + 1;
            }
            
            //checking for the below character at index i to identify that a sentence is completed. 
            else if(str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '!') {
            	
            	//checking current i value with the total index value in the string to avoid the StringIndexOutOfBoundException
            	if(i!=totalIndex) {
            		
            		//here we are checking if after the sentence splitter characters ('.','?','!') if there is any space on the next index, then we are ignoring that index.
	            	if(str.charAt(i+1)==' ') //&& (i+1)<str.length()-1)
	            	{
	            		i++;
	            	}
            	}
            	
            	//adding the number of words in a sentence= No. of spaces in a sentence + 1
            	list.add(temp+1);
            	
            	//Once a sentence is finished, making the value of temp to zero in order to store the number of spaces in the next sentence.
            	temp=0;
            }
        }
        
        //As we require the maximum words in a sentence so returning the max value from the list.
        return Collections.max(list);
    }

    public static void main(String[] args) {
        //String str="We test coders. Give us a try?";
    	String str="Hello there! we are going to see how to link project in eclipse with GIT.";
        System.out.println("Maximum words in a sentence is: "+stringCount(str));
        
    }
}
