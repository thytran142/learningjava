package com.vanntechs.chapter7;

/***************************************************************
 * Car3Driver.java
 * Dean & Dean
 *
 * This drives Car3 to illustrate method-call chaining.
 ***************************************************************/

public class Car3Driver
{
    public static void main(String[] args)
    {
        Car3 car = new Car3();

        car.setMake("Honda").setYear(1998).printIt();
    } // end main
} // end class Car3Driver