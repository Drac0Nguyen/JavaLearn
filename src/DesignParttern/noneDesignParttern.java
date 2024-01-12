/*
 * Copyright (c) 2024, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package DesignParttern;

/**
 * @author Nguyen Thai Thanh Long
 *
 */
class WithoutPatternDemo {
    private String message;

    // Constructor
    public WithoutPatternDemo(String message) {
        this.message = message;
    }

    // Getter method
    public String getMessage() {
        return message;
    }

    // Setter method
    public void setMessage(String message) {
        this.message = message;
    }
}
public class noneDesignParttern {

	/**
	 * @param args
	 */


	  public static void main(String[] args) {
	        // Create an instance without using a design pattern
	        WithoutPatternDemo demo = new WithoutPatternDemo("Hello, I am without a design pattern!");

	        // Use the instance
	        System.out.println(demo.getMessage());
	    }

}
