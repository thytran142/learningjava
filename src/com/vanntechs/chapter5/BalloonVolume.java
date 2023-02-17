package com.vanntechs.chapter5;

/******************************************************************
 * BalloonVolume.java
 * Dean & Dean
 *
 * This program computes the volume of a water balloon.
 ******************************************************************/

public class BalloonVolume
{
    public static void main(String[] args)
    {
        double diameter = 10.0;
        double volume = Math.PI / 6.0 * diameter * diameter * diameter;
        System.out.print("Balloon volume in cubic cm = " + volume);
    } // end main
} // end BalloonVolume