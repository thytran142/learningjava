package com.vanntechs.chapter12;

/********************************************
 * Employee.java
 * Dean & Dean
 *
 * The describes an employee.
 ********************************************/

public class Employee extends Person
{
    private int id = 0;

    //*****************************************

    public Employee()
    { }

    public Employee(String name, int id)
    {
        super(name);
        this.id = id;
    }

    //*****************************************

    public void display()
    {
        System.out.println("name: " + getName());
        System.out.println("id: " + id);
    }
} // end Employee class