package com.vanntechs.chapter7;

/***************************************************************
 * Car4Driver.java
 * Dean & Dean
 *
 * This class is a demonstration driver for the Car4 class.
 ***************************************************************/

public class Car4Driver
{
    public static void main(String[] args)
    {
        Car4 allexCar = new Car4("Porsche", 2006, "beige");
        Car4 latishaCar = new Car4("Saturn", 2002, "red");

        System.out.println(allexCar.getMake());
    } // end main
} // end class Car4Driver