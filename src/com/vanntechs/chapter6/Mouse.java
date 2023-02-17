package com.vanntechs.chapter6;

/************************************************************
 * Mouse.java
 * Dean & Dean
 *
 * This class models a mouse for a growth simulation program.
 ************************************************************/

public class Mouse
{
    private int age = 0;              // age of mouse in days
    private double weight = 1.0;      // weight of mouse in grams
    private double percentGrowthRate; // % weight increase per day

    //*********************************************************

    // This method assigns the mouse's percent growth rate.

    public void setPercentGrowthRate(double percentGrowthRate)
    {
        this.percentGrowthRate = percentGrowthRate;
    } // end setPercentGrowthRate

    //*********************************************************

    // This method simulates one day of growth for the mouse.

    public void grow()
    {
        this.weight += (.01 * this.percentGrowthRate * this.weight);
        this.age++;
    } // end grow

    //*********************************************************

    // This method prints the mouses's age and weight.

    public void display()
    {
        System.out.printf(
                "Age = %d, weight = %.3f\n", this.age, this.weight);
    } // end display
} // end class Mouse