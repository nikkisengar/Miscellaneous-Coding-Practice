package com.java.adjacent_elements_product;

import java.util.ArrayList;
import java.util.Collections;

//Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
public class AdjacentElementsProduct {

	public static int adjacentElementsProduct(int[] inputArray) {
		
		//taking a variable to store the product of adjacent elements.
		int adjacentElementsProduct=0;
		
		//ArrayList to store the product of all adjacent elements.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int i=0; i<inputArray.length-1; i++) {
			
			//Storing the product
			adjacentElementsProduct = inputArray[i] * inputArray[i+1];
			
			//adding the product to the list
			list.add(adjacentElementsProduct);
		}
		
		//return the max value of the product.
		return Collections.max(list);
	}
	
	public static void main(String[] args) {
		
		int[] inputArray = {8, 6, -2, -5, 7, 3};
		System.out.println(adjacentElementsProduct(inputArray));
	}

}
