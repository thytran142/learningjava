package com.vanntechs.chapter6;

/*****************************************************************
 * Mouse2.java
 * Dean & Dean
 *
 * This class models a mouse for a growth simulation program.
 *****************************************************************/

import java.util.Scanner;

public class Mouse2
{
    private int age = 0;               // age in days
    private double weight = 1.0;       // weight in grams
    private double percentGrowthRate;  // % daily weight gain

    //**************************************************************

    public void setPercentGrowthRate(double percentGrowthRate)
    {
        this.percentGrowthRate = percentGrowthRate;
    } // end setPercentGrowthRate

    //**************************************************************

    public int getAge()
    {
        return this.age;
    } // end getAge

    //**************************************************************

    public double getWeight()
    {
        return this.weight;
    } // end getWeight

    //**************************************************************

    public void grow(int days)
    {
        for (int i=0; i<days; i++)
        {
            this.weight +=
                    (0.01 * this.percentGrowthRate * this.weight);
        }
        this.age += days;
    } // end grow
} // end class Mouse2