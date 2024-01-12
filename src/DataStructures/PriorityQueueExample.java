/*
 * Copyright (c) 2023, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package DataStructures;

import java.util.PriorityQueue;

/**
 * @author Nguyen Thai Thanh Long
 *
 */

public class PriorityQueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	     // Creating a PriorityQueue (min-heap by default)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);

        // Displaying the elements of the PriorityQueue
        System.out.println("PriorityQueue elements: " + priorityQueue);

        // Polling (removing) elements from the PriorityQueue
        while (!priorityQueue.isEmpty()) {
            System.out.println("Processed element: " + priorityQueue.poll());
        }

        // Creating a PriorityQueue with a custom comparator (max-heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        // Adding elements to the max-heap
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(5);

        // Displaying the elements of the max-heap
        System.out.println("Max-heap elements: " + maxHeap);

        // Polling (removing) elements from the max-heap
        while (!maxHeap.isEmpty()) {
            System.out.println("Processed element: " + maxHeap.poll());
        }
	}

}
