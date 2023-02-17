package com.vanntechs.chapter5;

/******************************************************************
 * RandomTest.java
 * Dean & Dean
 *
 * This program demonstrates methods of the Random class.
 ******************************************************************/

import java.util.Random;

public class RandomTest
{
    public static void main(String[] args)
    {
        Random random = new Random();

        System.out.println(random.nextInt(Integer.MAX_VALUE));
        System.out.println(5.0 + 0.8 * random.nextGaussian());
    } // end main
} // end class RandomTest