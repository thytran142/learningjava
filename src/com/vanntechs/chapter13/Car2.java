package com.vanntechs.chapter13;

/******************************************************
 * Car2.java
 * Dean & Dean
 *
 * This instantiates a car and displays its properties.
 ******************************************************/

public class Car2
{
    private String make; // car's make
    private int year; // car's listed year
    private String color; // car's color

    //***************************************************

    public Car2(String make, int year, String color)
    {
        this.make = make;
        this.year = year;
        this.color = color;
    } // end Car2 constructor

    //***************************************************

    public String toString()
    {
        return "make = " + make + ", year = " + year +
                ", color = " + color;
    } // end toString

    //***************************************************

    public static void main(String[] args)
    {
        Car2 car = new Car2("Honda", 1998, "silver");
        System.out.println(car);
    } // end main
} // end class Car2