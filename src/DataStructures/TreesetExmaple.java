/*
 * Copyright (c) 2023, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package DataStructures;

import java.util.TreeSet;

/**
 * @author Nguyen Thai Thanh Long
 *
 */

public class TreesetExmaple {
	public static void main(String[] args) {
		 TreeSet<String> treeSet = new TreeSet<>();

	        // Adding elements to the TreeSet
	        treeSet.add("Banana");
	        treeSet.add("Apple");
	        treeSet.add("Orange");
	        treeSet.add("Grapes");
	        treeSet.add("Apple"); // Duplicate elements are not allowed

	        // Displaying the elements of the TreeSet (naturally sorted)
	        System.out.println("TreeSet elements: " + treeSet);

	        // Checking the size of the TreeSet
	        System.out.println("Size of TreeSet: " + treeSet.size());

	        // Checking if an element is present in the TreeSet
	        String elementToCheck = "Orange";
	        System.out.println("Is '" + elementToCheck + "' present? " + treeSet.contains(elementToCheck));

	        // Removing an element from the TreeSet
	        String elementToRemove = "Banana";
	        treeSet.remove(elementToRemove);

	        // Displaying the TreeSet after removal
	        System.out.println("TreeSet after removing '" + elementToRemove + "': " + treeSet);

	        // Iterating through the TreeSet
	        System.out.println("Iterating through the TreeSet:");
	        for (String fruit : treeSet) {
	            System.out.println(fruit);
	        }

	        // Clearing all elements from the TreeSet
	        treeSet.clear();

	        // Displaying the TreeSet after clearing
	        System.out.println("TreeSet after clearing: " + treeSet);
	    }
}
