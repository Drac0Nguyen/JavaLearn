/*
 * Copyright (c) 2023, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package DataStructures;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Nguyen Thai Thanh Long
 *
 */

public class TreemapExample {
	public static void main(String[] args) {

	  // Creating a TreeMap
    TreeMap<String, Integer> treeMap = new TreeMap<>();

    // Adding key-value pairs to the TreeMap
    treeMap.put("John", 25);
    treeMap.put("Alice", 30);
    treeMap.put("Bob", 28);
    treeMap.put("Eve", 22);

    // Displaying the elements of the TreeMap (naturally sorted by key)
    System.out.println("TreeMap elements: " + treeMap);

    // Accessing a specific value using a key
    String keyToFind = "Alice";
    System.out.println("Age of " + keyToFind + ": " + treeMap.get(keyToFind));

    // Checking if a key is present in the TreeMap
    String keyToCheck = "Mary";
    System.out.println("Is " + keyToCheck + " present? " + treeMap.containsKey(keyToCheck));

    // Iterating through the TreeMap using Map.Entry
    System.out.println("Iterating through the TreeMap:");
    for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
        System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
    }

    // Removing a key-value pair from the TreeMap
    String keyToRemove = "Bob";
    treeMap.remove(keyToRemove);

    // Displaying the TreeMap after removal
    System.out.println("TreeMap after removing " + keyToRemove + ": " + treeMap);

    // Checking the size of the TreeMap
    System.out.println("Size of TreeMap: " + treeMap.size());

    // Clearing all elements from the TreeMap
    treeMap.clear();

    // Displaying the TreeMap after clearing
    System.out.println("TreeMap after clearing: " + treeMap);
}
}
