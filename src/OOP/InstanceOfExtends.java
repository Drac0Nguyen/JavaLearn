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
class Animal {
    
}
public class InstanceOfExtends extends Animal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InstanceOfExtends dog = new InstanceOfExtends();
        System.out.println(dog instanceof InstanceOfExtends); // true
        System.out.println(dog instanceof Animal); // true
        
        
        InstanceOfExtends dognull = null;
       System.out.println(dognull instanceof InstanceOfExtends); // false
	}

}
