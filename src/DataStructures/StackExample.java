/*
 * Copyright (c) 2023, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package DataStructures;

import java.util.Stack;

/**
 * @author Nguyen Thai Thanh Long
 *
 */

public class StackExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// stack is a Last In, First Out
		   Stack<String> stack = new Stack<>();

	        // Pushing elements onto the stack
	        stack.push("Item 1");
	        stack.push("Item 2");
	        stack.push("Item 3");

	        // Displaying the elements of the stack
	        System.out.println("Stack elements: " + stack);

	        // Popping an element from the stack
	        String poppedElement = stack.pop();
	        System.out.println("Popped element: " + poppedElement);

	        // Displaying the stack after popping
	        System.out.println("Stack after popping: " + stack);

	        // Peeking at the top element without removing it
	        String topElement = stack.peek();
	        System.out.println("Top element without removal: " + topElement);

	        // Displaying the final stack
	        System.out.println("Final stack: " + stack);

	}

}
