package com.java.adjacent_elements_product;

import java.util.ArrayList;
import java.util.Collections;

public class AdjacentElementsProduct {

	public static int adjacentElementsProduct(int[] inputArray) {
		
		int adjacentElementsProduct=0;
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=0; i<inputArray.length-1; i++) {
			adjacentElementsProduct = inputArray[i] * inputArray[i+1];
			list.add(adjacentElementsProduct);
		}
		
		return Collections.max(list);
	}
	
	public static void main(String[] args) {
		
		int[] inputArray = {8, 6, -2, -5, 7, 3};
		System.out.println(adjacentElementsProduct(inputArray));
	}

}
