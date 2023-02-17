package com.vanntechs.chapter7;

/**********************************************************
 * Car3.java
 * Dean & Dean
 *
 * This class illustrates methods that can be chained.
 **********************************************************/

public class Car3
{
    private String make;
    private int year;

    //*******************************************************

    public Car3 setMake(String make)
    {
        this.make = make;
        return this;
    } // end setMake

    public Car3 setYear(int year)
    {
        this.year = year;
        return this;
    } // end setYear

    //*******************************************************

    public void printIt()
    {
        System.out.println(make + ", " + year);
    } // end printIt
} // end class Car3