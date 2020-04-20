package com.java.collection_programs;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProgramToFindGivenElementInArrayList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(4, 15, 6, 23, 7, 4);
		// System.out.println(list);

		System.out.println("Elements in the List are: " + list);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to find in the list: ");
		int elementToFind = sc.nextInt();

		System.out.println("is " + elementToFind + " present in the list (using explicit method): "
				+ isPreset(list, elementToFind));

		// or using contains() method of List

		System.out.println(
				"is " + elementToFind + " present in the list (using contains()): " + list.contains(elementToFind));

		sc.close();

	}

	public static boolean isPreset(List<Integer> list, int elementToFind) {

		boolean flag = false;

		for (int x : list) {
			if (elementToFind == x)
				flag = true;
		}

		return flag;
	}

}
