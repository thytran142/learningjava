package com.vanntechs.chapter13;

/************************************************
 * Car.java
 * Dean & Dean
 *
 * This defines and compares cars.
 ************************************************/

public class Car
{
    private String make;  // car's make
    private int year;     // car's listed year
    private String color; // car's color

    //*********************************************

    public Car(String make, int year, String color)
    {
        this.make = make;
        this.year = year;
        this.color = color;
    } // end Car constructor

    //*********************************************

    public boolean equals(Car otherCar)
    {
        return otherCar != null &&
                make.equals(otherCar.make) &&
                year == otherCar.year &&
                color.equals(otherCar.color);
    } // end equals

    //*********************************************

    public static void main(String[] args)
    {
        Car carA = new Car("Chrysler", 2007, "white");
        Car carB = new Car("Chrysler", 2007, "white");

        System.out.println(carA.equals(carB));
    } // end main
} // end class Car