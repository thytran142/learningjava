package com.vanntechs.chapter9;

/*********************************************************************
 * Student.java
 * Dean & Dean
 *
 * This class handles processing of a student's name.
 *********************************************************************/

import java.util.Scanner;

public class Student
{
    private String first = ""; // student's first name
    private String last = "";  // student's last name

    //******************************************************************

    public Student()
    { }

    // This constructor verifies that each passed-in name starts
    // with an uppercase letter and follows with lowercase letters.

    public Student(String first, String last)
    {
        setFirst(first);
        setLast(last);
    }

    //******************************************************************

    // This method verifies that first starts with an uppercase
    // letter and contains lowercase letters thereafter.

    public void setFirst(String first)
    {
        // [A-Z][a-z]* is a regular expression. See API Pattern class.
        if (first.matches("[A-Z][a-z]*"))
        {
            this.first = first;
        }
        else
        {
            System.out.println(first + " is an invalid name.\n" +
                    "Names must start with an uppercase letter and have" +
                    " lowercase letters thereafter.");
        }
    } // end setFirst

    //********************************************************************

    // This method verifies that last starts with an uppercase
    // letter and contains lowercase letters thereafter.

    public void setLast(String last)
    {
        // [A-Z][a-z]* is a regular expression. See API Pattern class.
        if (last.matches("[A-Z][a-z]*"))
        {
            this.last = last;
        }
        else
        {
            System.out.println(last + " is an invalid name.\n" +
                    "Names must start with an uppercase letter and have" +
                    " lowercase letters thereafter.");
        }
    } // end setLast

    //*******************************************************************

    // Print the student's first and last names.

    public void printFullName()
    {
        System.out.println(this.first + " " + this.last);
    } // end printFullName
} // end class Student
