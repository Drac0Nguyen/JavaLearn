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

public class ContructorOverloading {
	  private String website;
      
	    private String subject;
	      
	    public ContructorOverloading(){
	        System.out.println("This is default constructor.");
	    }
	  
	    public ContructorOverloading(String website) {
	        this.website = website;
	        System.out.println("This is parameterized constructor");
	        System.out.println("from website = " + website);
	    } 
	      
	    public ContructorOverloading(String website, String subject) {
	        this.website = website;
	        this.subject = subject;
	        System.out.println("This is parameterized constructor");
	        System.out.println("from website = " + website);
	        System.out.println("with subject = " + subject);
	    }   
	       
	    public void demo (String data) {
	    	
	    }
	    
	    public void demo (String data, int data2) {
	    	
	    }
	    public static void main(String[] args){
	    	ContructorOverloading obj = new ContructorOverloading();
	        System.out.println("---");
	        obj = new ContructorOverloading("gpcoder.com");  
	        System.out.println("---");
	        obj = new ContructorOverloading("gpcoder.com", "OOP"); 
	          
	    }
}
