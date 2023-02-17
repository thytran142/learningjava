package com.vanntechs.chapter12;

/*************************************************************
 * FullTime.java
 * Dean & Dean
 *
 * The describes a full-time employee.
 *************************************************************/

public class FullTime extends Employee
{
    private double salary = 0.0;

    //**********************************************************

    public FullTime()
    { }

    public FullTime(String name, int id, double salary)
    {
        super(name, id);
        this.salary = salary;
    }

    //**********************************************************

    public void display()
    {
        super.display();
        System.out.printf(
                "salary: $%,.0f\n", salary);
    }
} // end FullTime class