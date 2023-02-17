package com.vanntechs.chapter9;

/***********************************************************
 * SquareDriver.java
 * Dean & Dean
 *
 * This is the driver for the Square class.
 ***********************************************************/

import java.util.Scanner;

public class SquareDriver
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        Square square;

        System.out.print("Enter width of desired square: ");
        square = new Square(stdIn.nextInt());
        System.out.println("Area = " + square.getArea());
        square.draw();
    } // end main
} // end class SquareDriver