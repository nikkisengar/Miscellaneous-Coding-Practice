package com.java.word_count;

import java.util.ArrayList;
import java.util.Collections;

public class StringWordCount {

    public static int stringCount(String str){
        int temp=0;
        int totalIndex=str.length()-1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i=0; i<=totalIndex;i++) {
            if (str.charAt(i) == ' ') {
                temp = temp + 1;
            }
            else if(str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '!') {
            	if(i!=totalIndex) {
	            	if(str.charAt(i+1)==' ' && (i+1)<str.length()-1)
	            	{
	            		i++;
	            	}
            	}
            	list.add(temp+1);
            	temp=0;
            }
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        String str="We test coders. Give us a try?";
        System.out.println("Maximum words in a sentence is: "+stringCount(str));
        
    }
}
