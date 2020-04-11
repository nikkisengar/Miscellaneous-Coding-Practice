package com.java.target_array_in_the_given_order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TargetArray {
    public int[] createTargetArray(int[] numArray, int[] indexArray) {

        int[] targetArray = new int[numArray.length];

        /*Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
        Output: [0,4,1,3,2]*/
        
        if (numArray.length >= 1 && indexArray.length <= 100 && (numArray.length == indexArray.length)) {

            List<Integer> targetList = new ArrayList<>(numArray.length);

            for (int i = 0; i < numArray.length; i++) {
                targetList.add(indexArray[i], numArray[i]);
            }

            for (int i = 0; i < targetArray.length; i++)
                targetArray[i] = targetList.get(i);

        } else {
            System.out.println("Input arrays can't be empty or input arrays can't have more than 100 elements or both input arrays must have same length");
        }

        return targetArray;
    }
}

public class TargetArraySolution {
    public static void main(String[] args) {

        // This is the starting array which we need to insert into target
        // array on the particular indexes provided in the indexArray
        int[] numArray = {1, 2, 3, 4, 0};

        // This array defines the indexes where we need to insert the numArray in the targetArray
        int[] indexArray = {0, 1, 2, 3, 0};

        TargetArray t = new TargetArray();

        // printing the targetArray
        System.out.print("Numbers: " + Arrays.toString(numArray) + "\t\t");
        System.out.println("Index: " + Arrays.toString(indexArray));
        System.out.println("Target Array: " + Arrays.toString(t.createTargetArray(numArray, indexArray)));
    }
}