package com.practice.collectionframeworks;

import java.util.LinkedList;

/**
 * @author Manish Singh
 *
 * 31-Jan-2024
 */
public class DemoLinkedList {

	public static void main(String[] args) {
		
	LinkedList l = new LinkedList();	
		
		l.add(10);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		System.out.println("-----------------");
		for(int i=0; i<l.size();i++) {
			System.out.println("Objects after traversing in insertion order:"+l.get(i));
		}
		
		System.out.println("-----------------");
		for(int i=l.size()-1; i>=0;i--) {
			System.out.println("Objects in reverse order:"+l.get(i));
		}
		
		
		System.out.println("-----------------");
		int[] x = {10,20,30};
		System.out.println("Size of array :"+x.length); // used .length only for array
		
		System.out.println("-----------------");
		String y = "java";
		System.out.println("Size of String :"+y.length()); // used .length() only for String
		
		System.out.println("-----------------");
		System.out.println("Size of Collection :"+l.size()); // used .size() only for collection
	}

}
