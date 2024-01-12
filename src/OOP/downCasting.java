/*
 * Copyright (c) 2024, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package OOP;

import OOP.Upcasting.Animal;

/**
 * @author Nguyen Thai Thanh Long
 *
 */

public class downCasting {
	  class Animal {
	        public void eat() {
	            System.out.println("eating...");
	        }
	    }
	    
	    class Cat1 extends Animal {
	        public void meow() {
	            System.out.println("meowing...");
	        }
	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		downCasting downCasting = new downCasting();
		downCasting.Cat1 cat1 = downCasting.new Cat1();
	    Animal animal = cat1;

	    // Downcasting
	    Cat1 cat = (Cat1) animal;
	    cat.meow();
	}

}
