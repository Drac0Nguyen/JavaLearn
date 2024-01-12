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
class AnimalHierarchical  {
    public void eat() {
        System.out.println("eating...");
    }
}
 
class DogHierarchical  extends AnimalHierarchical  {
    public void bark() {
        System.out.println("barking...");
    }
}
 
class Cat extends AnimalHierarchical  {
    public void meow() {
        System.out.println("meowing...");
    }
}
public class HierarchicalInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Cat c = new Cat();
	        c.meow();
	        c.eat();
	}

}
