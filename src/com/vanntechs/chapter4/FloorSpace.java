package com.vanntechs.chapter4;

/***************************************************************
 * FloorSpace.java
 * Dean & Dean
 *
 * This program calculates total floor space in a house.
 ****************************************************************/

import java.util.Scanner;

public class FloorSpace
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        double length, width;     // room dimensions
        double floorSpace = 0;    // house's total floor space
        char response;            // user's y/n response

        do
        {
            System.out.print("Enter the length: ");
            length = stdIn.nextDouble();
            System.out.print("Enter the width: ");
            width = stdIn.nextDouble();
            floorSpace += length * width;
            System.out.print("Any more rooms? (y/n): ");
            response = stdIn.next().charAt(0);
        } while (response == 'y' || response == 'Y');

        System.out.println("Total floor space is " + floorSpace);
    } // end main
} // end class FloorSpace