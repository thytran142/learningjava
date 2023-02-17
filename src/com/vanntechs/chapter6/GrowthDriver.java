package com.vanntechs.chapter6;

/******************************************************************
 * GrowthDriver.java
 * Dean & Dean
 *
 * This compares exact and simulated solutions for growth.
 ******************************************************************/

import java.util.Scanner;

public class GrowthDriver
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        double timeStep;
        double timeMax;
        Growth entity = new Growth();
        double startSize = 1.0;          // weight in grams
        double endSize = 40.0;           // weight in grams
        double fractionGrowthRate = 1.0; // per unit time

        double size = startSize;
        entity.initialize(startSize, endSize, fractionGrowthRate);
        System.out.print("Enter time increment: ");
        timeStep = stdIn.nextDouble();
        System.out.print("Enter total time units to simulate: ");
        timeMax = stdIn.nextDouble();
        System.out.println("       exact  simulated");
        System.out.println("time    size    size");

        for (double time=0.0; time<=timeMax; time+=timeStep)
        {
            System.out.printf("%4.1f%8.1f%8.1f\n",
                    time, entity.getSize(time), size);
            size += entity.getSizeIncrement(size, timeStep);
        } // end for
    } // end main
} // end class GrowthDriver