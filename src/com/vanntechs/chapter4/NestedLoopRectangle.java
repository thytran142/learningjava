package com.vanntechs.chapter4;

/************************************************************
 * NestedLoopRectangle.java
 * Dean & Dean
 *
 * This program uses nested looping to draw a rectangle.
 *************************************************************/

import java.util.Scanner;

public class NestedLoopRectangle
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int height, width; // rectangle's dimensions
        char printCharacter;

        System.out.print("Enter height: ");
        height = stdIn.nextInt();
        System.out.print("Enter width: ");
        width = stdIn.nextInt();
        System.out.print("Enter character: ");
        printCharacter = stdIn.next().charAt(0);
        for (int row=1; row<=height; row++)
        {
            for (int col=1; col<=width; col++)
            {
                System.out.print(printCharacter);
            }
            System.out.println();
        }
    } // end main
} // end class NestedLoopRectangle