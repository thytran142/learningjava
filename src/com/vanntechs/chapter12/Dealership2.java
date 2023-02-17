package com.vanntechs.chapter12;

/************************************************************
 * Dealership2.java
 * Dean & Dean
 *
 * This represents an auto retail sales organization.
 ************************************************************/

import java.util.ArrayList;

public class Dealership2
{
    private String company;
    private Manager2 manager;
    private ArrayList<SalesPerson2> people =
            new ArrayList<SalesPerson2> ();
    private ArrayList<Car> cars = new ArrayList<Car> ();

    //*********************************************************

    public Dealership2(String company, Manager2 manager)
    {
        this.company = company;
        this.manager = manager;
    }

    //*********************************************************

    public void addCar(Car car)
    {
        cars.add(car);
    }

    public void addPerson(SalesPerson2 person)
    {
        people.add(person);
    }

    //*********************************************************

    public void printStatus()
    {
        System.out.println(company + "\t" + manager.getName());
        for (SalesPerson2 person : people)
            System.out.println(person.getName());
        for (Car car : cars)
            System.out.println(car.getMake());
    } // end printStatus
} // end Dealership2 class