package com.vanntechs.chapter13;

/**********************************************
 * Salaried2.java
 * Dean & Dean
 *
 * This class implements a salaried employee.
 **********************************************/

public class Salaried2 extends Employee2
{
    private double salary;      // per year

    //*******************************************

    public Salaried2(String name, double salary)
    {
        super(name);
        this.salary = salary;
    } // end constructor

    //*******************************************

    public double getPay()
    {
        return this.salary / 24;  // per half month
    } // end getPay
} // end class Salaried2
