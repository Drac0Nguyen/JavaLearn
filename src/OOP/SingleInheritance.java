/*
 * Copyright (c) 2023, Robert Bosch GmbH and its subsidiaries.
 * This program and the accompanying materials are made available under
 * the terms of the Bosch Internal Open Source License v4
 * which accompanies this distribution, and is available at
 * http://bios.intranet.bosch.com/bioslv4.txt
 */

package OOP;

/**
 * @author Nguyen Thai Thanh Long
 *
 */
class AnimalSingle {
    public void eat() {
        System.out.println("eating...");
    }
}
 
class Dog extends AnimalSingle {
    public void bark() {
        System.out.println("barking...");
    }
}
public class SingleInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Dog d = new Dog();
	        d.bark();
	        d.eat();
	}

}
