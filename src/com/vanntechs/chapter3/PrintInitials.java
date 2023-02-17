package com.vanntechs.chapter3;

/*******************************************************************
 * PrintInitials.java
 * Dean & Dean
 *
 * This program prints the initials for a user-entered name.
 *******************************************************************/

import java.util.Scanner;

public class PrintInitials
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String first; // first name
        String last; // last name
        System.out.print(
                "Enter your first and last name separated by a space: ");
        first = stdIn.next();
        last = stdIn.next();
        System.out.println("Your initials are " +
                first.charAt(0) + last.charAt(0) + ".");
    } // end main
} // end class PrintInitials