package com.practice.array;

import java.util.Arrays;

public class SortingArray {

		public static void main(String[] args) {
	        int[] myArray = {5, 2, 8, 7, 1};

	        System.out.println("Original Array: " + Arrays.toString(myArray));

	        // Sorting logic using nested loops
	        for (int i = 0; i < myArray.length - 1; i++) {
	            for (int j = i + 1; j < myArray.length; j++) {
	                if (myArray[i] > myArray[j]) {
	                    int temp = myArray[i];
	                    myArray[i] = myArray[j];
	                    myArray[j] = temp;
	                }
	            }
	        }

//	        System.out.println("Sorted Array: " + Arrays.toString(myArray));
	        for(int a :myArray) {
	        	System.out.println("Sorted Array: "+a);
	        }
	    }
	}


