package com.vanntechs.chapter13;

/******************************************
 * Employee2.java
 * Dean & Dean
 *
 * This abstract class describes employees.
 ******************************************/

public abstract class Employee2
{
    public abstract double getPay();
    private String name;

    //***************************************

    public Employee2(String name)
    {
        this.name = name;
    }

    //***************************************

    public void printPay(int date)
    {
        System.out.printf("%2d %10s: %8.2f\n",
                date, name, getPay());
    } // end printPay
} // end class Employee2