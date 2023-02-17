package com.vanntechs.chapter12;

/*************************************************
 * SalesPerson.java
 * Dean & Dean
 *
 * This class implements a car sales person.
 *************************************************/

public class SalesPerson
{
    private String name;
    private double sales = 0.0; // sales to date

    //**********************************************

    public SalesPerson(String name)
    {
        this.name = name;
    }

    //**********************************************

    public String getName()
    {
        return name;
    }
} // end SalesPerson class