/*
 * Copyright (c) 2023, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Nguyen Thai Thanh Long
 *
 */

public class QueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//a First In, First Out (FIFO) 
		Queue<String> queue = new LinkedList<>();

	        // Enqueue (add) elements to the queue
	        queue.add("Task 1");
	        queue.add("Task 2");
	        queue.add("Task 3");

	        // Displaying the elements of the queue
	        System.out.println("Queue elements: " + queue);

	        // Dequeue (remove) an element from the queue
	        String dequeuedElement = queue.poll();
	        System.out.println("Dequeued element: " + dequeuedElement);

	        // Displaying the queue after dequeue operation
	        System.out.println("Queue after dequeue: " + queue);

	        // Peek at the front element without removing it
	        String frontElement = queue.peek();
	        System.out.println("Front element without removal: " + frontElement);

	        // Displaying the final state of the queue
	        System.out.println("Final queue: " + queue);
	}

}
