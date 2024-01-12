/*
 * Copyright (c) 2023, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package DataStructures;

import java.util.HashSet;

/**
 * @author Nguyen Thai Thanh Long
 *
 */

public class HashsetExample {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Apple"); // Duplicate elements are not allowed

        // Displaying the elements of the HashSet
        System.out.println("HashSet elements: " + hashSet);

        // Removing an element from the HashSet
        hashSet.remove("Banana");

        // Displaying the HashSet after removal
        System.out.println("HashSet after removing 'Banana': " + hashSet);

        // Checking if an element is present in the HashSet
        String searchElement = "Orange";
        System.out.println("Is '" + searchElement + "' present? " + hashSet.contains(searchElement));

        // Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Checking the size of the HashSet
        System.out.println("Size of HashSet: " + hashSet.size());

        // Clearing all elements from the HashSet
        hashSet.clear();

        // Displaying the HashSet after clearing
        System.out.println("HashSet after clearing: " + hashSet);
	}
}
