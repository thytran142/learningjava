package com.vanntechs.chapter6;

/******************************************************
 * Mouse2Driver.java
 * Dean & Dean
 *
 * This is a driver for the Mouse2 class.
 ******************************************************/

import java.util.Scanner;

public class Mouse2Driver
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        Mouse2 mickey = new Mouse2();
        int days;

        mickey.setPercentGrowthRate(10);
        System.out.print("Enter number of days to grow: ");
        days = stdIn.nextInt();
        mickey.grow(days);
        System.out.printf("Age = %d, weight = %.3f\n",
                mickey.getAge(), mickey.getWeight());
    } // end main
} // end class Mouse2Driver