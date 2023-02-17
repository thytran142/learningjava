package com.vanntechs.chapter13;

/**********************************************
 * Salaried.java
 * Dean & Dean
 *
 * This class implements a salaried employee.
 **********************************************/

public class Salaried extends Employee
{
    private double salary;      // per year

    //*******************************************

    public Salaried(String name, double salary)
    {
        super(name);
        this.salary = salary;
    } // end constructor

    //*******************************************

    public double getPay()
    {
        return this.salary / 24;  // per half month
    } // end getPay
} // end class Salaried