
package com.practice.collectionframeworks;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Manish Singh
 *
 * 31-Jan-2024
 */
public class MethodsUsage {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println("Objects inside ArrayList: "+al+"  Size: "+al.size());
		
		System.out.println("-----------------------");
		LinkedList ll = new LinkedList();
		
		/* 
		 * .addAll() is used to add all the objects of one collection into another collection
		 * 
		 * */
		
		ll.addAll(al);
		ll.add(40);
		
		System.out.println("Objects inside LinkedList: "+ll+"  Size: "+ll.size());
		
		/*
		 * containsAll() is used to check if all the objects of one collection is
		 * present inside another collection or not
		 */
		
		System.out.println(ll.containsAll(al)); // true
		
		ll.remove(1);
		
		System.out.println("Objects inside LinkedList 1st: "+ll+ "Size: "+ll.size());
		System.out.println(ll.containsAll(al));
		
		
		System.out.println("---------------------");
		ll.removeAll(al);
	}

}
