package com.vanntechs.chapter7;

/************************************************************
 * GarageDoorDriver.java
 * Dean & Dean
 *
 * This simulates installation and testing.
 ************************************************************/

import java.util.Scanner;

public class GarageDoorDriver
{
    public static void main(String[] args)
    {
        GarageDoorSystem system;
        Scanner stdIn = new Scanner(System.in);

        // Install system
        system = new GarageDoorSystem();

        // Test system
        System.out.print("Enter number of operations: ");
        system.run(stdIn.nextInt());
    } // end main
} // end class GarageDoorDriver
