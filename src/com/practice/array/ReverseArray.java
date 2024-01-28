package com.practice.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int a[] = {3,5,1,3,6,8,2};
		int sum =0;
		int initial =0;
		int assigned =0;

		System.out.println("array length :"+Arrays.toString(a));
		for(int i=a.length-1; i>=0; i-- ) {
			
			System.out.println(a[i]);
			sum = sum + a[i];
			
			if(initial >= a[i])
			assigned =	a[i];
			// sorting the given no.
			System.out.println("Sorted elements :"+a[i]);

		}
		
		System.out.println("Sum :"+ sum);
		System.out.println("Avg :"+ sum/a.length);

	}

}
