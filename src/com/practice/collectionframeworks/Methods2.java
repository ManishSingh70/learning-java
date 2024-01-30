/**
 * 
 */
package com.practice.collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Manish Singh
 *
 * 31-Jan-2024
 */
public class Methods2 {

	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al);
		
		/*
		 * Here, add() is used to add an object based on the index position already
		 * existing object gets shifted to next position
		 */
		al.add(1, 50);
		System.out.println("al.add(1, 50) :"+al);
		
		/*
		 * Here, set() is used to add an object based on the index position already
		 * existing object gets overridden
		 */
		al.set(2, 70);
		System.out.println("al.set(2, 50) :"+al);
		
		System.out.println("===========================");
		ArrayList l = new ArrayList();
		l.add(93);
		l.add(80);
		l.add(41);
		l.add(60);
		System.out.println("Before sorting :"+l);
		
		Collections.sort(l);
		System.out.println("After sorting :"+l); // sorted in natural ascending order
		
	}
}
