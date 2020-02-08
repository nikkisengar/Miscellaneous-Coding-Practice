package com.java.collection_overview;

import java.util.ArrayList;
import java.util.Collections;

public class ListCollectionSortingUsingLambdaExpression {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		
		l.add(6);
		l.add(2);
		l.add(19);
		l.add(21);
		l.add(0);
		
		System.out.println("Before Sorting: "+l);
		
		Collections.sort(l,(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		System.out.println("After Sorting: "+l);
	}

}
