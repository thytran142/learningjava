package com.vanntechs.chapter12;

/****************************************************************
 * Sale.java
 * Dean & Dean
 *
 * This class associates SalesPerson2, Car, and Customer classes.
 ****************************************************************/

public class Sale
{
    private Car car;
    private SalesPerson2 salesperson;
    private Customer customer;
    private double price;
    //...

    //*************************************************************

    public Sale(Car car, SalesPerson2 person,
                Customer customer, double price)
    {
        this.car = car;
        this.salesperson = person;
        this.customer = customer;
        this.price = price;

        //...
    } // end constructor
} // end Sale