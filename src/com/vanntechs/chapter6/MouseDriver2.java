package com.vanntechs.chapter6;

/*****************************************************
 * MouseDriver2.java
 * Dean & Dean
 *
 * This is a driver for the Mouse class.
 *****************************************************/

import java.util.Scanner;

public class MouseDriver2
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        double growthRate;
        Mouse gus, jaq;

        System.out.print("Enter % growth rate: ");
        growthRate = stdIn.nextDouble();
        gus = new Mouse();
        gus.setPercentGrowthRate(growthRate);
        gus.grow();
        gus.display();
        jaq = new Mouse();
        jaq.grow();
        jaq.display();
    } // end main
} // end class MouseDriver2