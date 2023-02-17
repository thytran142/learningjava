package com.vanntechs.chapter7;

import java.util.Scanner;

public class Employee
{
    private String name;

    //*****************************************

    public void readName()
    {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Name: ");
        this.name = stdIn.nextLine();
    } // end readName
} // end class Employee
