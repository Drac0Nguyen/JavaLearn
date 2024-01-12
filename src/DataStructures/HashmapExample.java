/*
 * Copyright (c) 2023, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package DataStructures;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author Nguyen Thai Thanh Long
 *
 */

public class HashmapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 28);
        hashMap.put("Eve", 22);

        // Displaying the elements of the HashMap
        System.out.println("HashMap elements: " + hashMap);

        // Accessing a specific value using a key
        String keyToFind = "Alice";
        System.out.println("Age of " + keyToFind + ": " + hashMap.get(keyToFind));

        // Checking if a key is present in the HashMap
        String keyToCheck = "Mary";
        System.out.println("Is " + keyToCheck + " present? " + hashMap.containsKey(keyToCheck));

        // Iterating through the HashMap using Map.Entry
        System.out.println("Iterating through the HashMap:");
        for (Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }

        // Removing a key-value pair from the HashMap
        String keyToRemove = "Bob";
        hashMap.remove(keyToRemove);

        // Displaying the HashMap after removal
        System.out.println("HashMap after removing " + keyToRemove + ": " + hashMap);

        // Checking the size of the HashMap
        System.out.println("Size of HashMap: " + hashMap.size());

        // Clearing all elements from the HashMap
        hashMap.clear();

        // Displaying the HashMap after clearing
        System.out.println("HashMap after clearing: " + hashMap);
	}

}
