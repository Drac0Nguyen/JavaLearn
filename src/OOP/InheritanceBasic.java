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
class Employee {
	 
    protected float salary = 40000;
 
}
public class InheritanceBasic extends Employee {
	  int bonus = 10000;
	  
	    public static void main(String args[]) {
	    	InheritanceBasic p = new InheritanceBasic();
	        System.out.println("Programmer salary is:" + p.salary);
	        System.out.println("Bonus of Programmer is:" + p.bonus);
	    }

}
