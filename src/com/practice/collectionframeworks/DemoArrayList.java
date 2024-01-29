package com.practice.collectionframeworks;
import java.util.ArrayList;

public class DemoArrayList {

	
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		
		l.add(10);
		l.add(20.13);
		l.add(null);
		l.add(10);
		l.add("java");
		
		System.out.println(l);
		
		/*
		 * Specification of list/arrayList is verified 
		 * ------------------------------------------------ 
		 * 1. always maintains the insertion order 
		 * 2. duplicates are allowed inside the list 
		 * 3. list is indexed based 
		 * 4. null value can be inserted
		 */
		
		System.out.println("--------------------------");
		
		/* .size() returns the length of the collection*/
		System.out.println("Length of the collection is : "+l.size());
		System.out.println("--------------------------");
		/* .get() returns the object based on the index position*/
		System.out.println("Object at this index postion is : "+ l.get(3));
		
		System.out.println("--------------------------");
		//System.out.println(l.get(250)); // IndexOutOfBoundsException
		
		System.out.println("--------------------------");
		/* .contains is used to check if the object is present in the collection  or not */
		System.out.println(l.contains("java"));
		System.out.println(l.contains("Java"));
		
		System.out.println("--------------------------");
		System.out.println("Before removed :"+l);
		
		/* .remove() is used to remove an object based on index position*/
		l.remove(3);
		System.out.println("After removed :"+l);
		System.out.println("--------------------------");
		
		/* isEmpty() is used to check if the collection is empty or not */
		System.out.println(l.isEmpty());
		
		/* .clear() will remove all the objects from the collection */
		l.clear();
		System.out.println(l.isEmpty());
		System.out.println("============================");
		
		
		ArrayList x = new ArrayList();
		x.add(9);
		x.add(10);
		x.add(11);
		x.add(10);
		x.add(10);
		/* .indexOf() is used to find the position of an object and 1st occurrence in case of duplicates*/
		System.out.println(x);
		System.out.println(x.indexOf(10));
		System.out.println("--------------------------");
		System.out.println(x.lastIndexOf(10)); // gives the last index of object if it contains duplicates
		System.out.println("--------------------------");
		
	}
}
