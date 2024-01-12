/*
 * Copyright (c) 2023, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package DataStructures;

import java.util.LinkedList;

/**
 * @author Nguyen Thai Thanh Long
 *
 */

public class LinkedListExample {
	public static void main(String[] args) {
	     LinkedList<String> linkedList = new LinkedList<>();

	        // Adding elements to the LinkedList
	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");
	        linkedList.add("Grapes");

	        // Displaying the elements of the LinkedList
	        System.out.println("LinkedList elements: " + linkedList);

	        // Adding an element at the beginning of the LinkedList
	        linkedList.addFirst("Mango");

	        // Adding an element at the end of the LinkedList
	        linkedList.addLast("Pineapple");

	        // Displaying the modified LinkedList
	        System.out.println("Modified LinkedList: " + linkedList);

	        // Removing an element from the LinkedList
	        linkedList.remove("Banana");

	        // Displaying the LinkedList after removal
	        System.out.println("LinkedList after removing 'Banana': " + linkedList);

	        // Iterating through the LinkedList using a for-each loop
	        System.out.println("Iterating through the LinkedList:");
	        for (String fruit : linkedList) {
	            System.out.println(fruit);
	        }
	}
}
