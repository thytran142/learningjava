package com.vanntechs.chapter13;

/****************************************************
 * Hourly.java
 * Dean & Dean
 *
 * This class implements an employee paid by the hour.
 ****************************************************/

public class Hourly extends Employee
{
    private double hourlyRate;
    private double hours = 0.0;

    //*************************************************

    public Hourly(String name, double rate)
    {
        super(name);
        hourlyRate = rate;
    } // end constructor

    //*************************************************

    public double getPay()
    {
        double pay = hourlyRate * hours;
        hours = 0.0;
        return pay;
    } // end getPay

    //*************************************************

    public void addHours(double hours)
    {
        this.hours += hours;
    } // end addHours
} // end class Hourly