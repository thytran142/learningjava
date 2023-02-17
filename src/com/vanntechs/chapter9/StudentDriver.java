package com.vanntechs.chapter9;

/*******************************************************
 * StudentDriver.java
 * Dean & Dean
 *
 * This class acts as a driver for the Student class.
 ********************************************************/

public class StudentDriver
{
    public static void main(String[] args)
    {
        Student s1;  // first student
        Student s2;  // second student

        s1 = new Student();
        s1.setFirst("Adeeb");
        s1.setLast("Jarrah");
        s2 = new Student("Heejoo", "Chun");
        s2.printFullName();
    } // end main
} // end class StudentDriver
