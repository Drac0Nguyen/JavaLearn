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
class Singleton {
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
    }

    // Lazy initialization of the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods of the singleton class
    public void displayMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}

public class withDesignParttern {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();

        // Use the singleton instance
        singleton.displayMessage();
    }
}
