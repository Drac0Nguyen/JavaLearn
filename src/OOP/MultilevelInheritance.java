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
class animals {
    public void eat() {
        System.out.println("eating...");
    }
}
 
class Dogs extends animals {
    public void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dogs {
	@Override
	public void eat() {
		System.out.println("override...");
		super.eat();
	}
	public void weep() {
        System.out.println("weeping...");
    }
}
public class MultilevelInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BabyDog d = new BabyDog();
	        d.weep();
	        d.bark();
	        d.eat();
	}

}
