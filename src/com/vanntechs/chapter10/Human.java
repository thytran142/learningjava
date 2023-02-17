package com.vanntechs.chapter10;

public class Human
{
    private static final double NORMAL_TEMP = 98.6;
    private double currentTemp;
    //...

    public boolean isHealthy()
    {
        return Math.abs(currentTemp - NORMAL_TEMP) < 1;
    } // end isHealthy

    public void diagnose()
    {
        if ((currentTemp - NORMAL_TEMP) > 5)
        {
            System.out.println("Go to the emergency room now!");
            //...
        }
    }
} // end class Human