package com.java.strictly_increasing_sequence;

public class StrictlyIncreasingSequence {

	public static boolean strictlyIncreasingSequence(int[] sequence) {

		boolean isIncreasingSequence = false;

		int temp = 0;

		int[] newArray = new int[sequence.length - 1];

		if ((sequence.length - 1) == 1)
			isIncreasingSequence = true;
		else
			for (; temp < sequence.length;) {
				for (int i = 0, k = 0; i < sequence.length; i++) {
					if (i == temp)
						continue;

					if (i == sequence.length - 1)
						temp++;

					newArray[k++] = sequence[i];
				}

				for (int j = 0; j < newArray.length - 1; j++) {

					if (newArray[j + 1] > newArray[j]) {
						isIncreasingSequence = true;
						continue;
					} else {
						isIncreasingSequence = false;
						break;
					}
				}
				if (isIncreasingSequence) {
					break;
				}
			}

		return isIncreasingSequence;
	}

	public static void main(String[] args) {

		int[] sequence = { 3, 5, 67, 98, 3 };

		System.out.println(strictlyIncreasingSequence(sequence));

	}

}
