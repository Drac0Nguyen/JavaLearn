/*
 * Copyright (c) 2024, Robert Bosch GmbH and its subsidiaries.
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

public class Upcasting {
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

    public static void main(String[] args) {
        Upcasting upcasting = new Upcasting(); // Create an instance of Upcasting
        Upcasting.Cat1 cat = upcasting.new Cat1(); // Create an instance of Cat1 using the instance of Upcasting

        Animal animal1 = cat; // Upcasting without an instance of Upcasting
        Animal animal2 = (Animal) cat; // Explicit upcasting

        cat.eat();
        cat.meow();
        animal1.eat();
        animal2.eat();
    }
}
