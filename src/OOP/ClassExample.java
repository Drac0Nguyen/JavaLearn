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

public class 	ClassExample {

	/**
	 * @param args
	 */
	// đây là một class của object studentss
	public class Student {
	    // Khai báo thuộc tính
	    private int id; 
	    private String name;
	      
	    // Hàm khởi tạo có 1 tham số là id
	    public Student(int id) {
	        // Sử dụng từ khóa this để truy cập thuộc tính trong lớp
	        // nếu không sử dụng từ khóa this thì đang truy cập vào tham số của hàm khởi tạo
			// đây là một object khi gọi( student 1 student 2 ...)
	        this.id = id;
	    }
	  
	    // Cung cấp phương thức lấy giá trị id
	    public int getId() {
	        return id;
	    }
	  
	    // Cung cấp phương thức lấy giá trị name
	    public String getName() {
	        return name;
	    }
	  
	    // Cung cấp phương thức gán giá trị name
	    public void setName(String name) {
	        this.name = name;
	    }
	}
	public static void main(String[] args) {
        ClassExample classExample = new ClassExample();
        Student student = classExample.new Student(1);
        
		student.setName("gpcoder");
		System.out.println("Id=" + student.getId());
		System.out.println("Name=" + student.getName());
	}

}
