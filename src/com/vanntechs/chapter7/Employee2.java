package com.vanntechs.chapter7;

import java.util.Scanner;

public class Employee2
{
    private String name;

    //***************************************

    public Employee2(String n)
    {
        this.name = n;
    } // end constructor

    //***************************************

    public void readName()
    {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Name: ");
        this.name = stdIn.nextLine();
    } // end readName
} // end class Employee2
