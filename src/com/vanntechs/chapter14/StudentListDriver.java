package com.vanntechs.chapter14;

/*************************************************************
 * StudentListDriver.java
 * Dean & Dean
 *
 * This is the driver for the StudentList class.
 *************************************************************/

public class StudentListDriver
{
    public static void main(String[] args)
    {
        String[] names = {"Caleb", "Izumi", "Mary", "Usha"};
        StudentList studentList = new StudentList(names);

        studentList.display();
        studentList.removeStudent(6);
        studentList.display();
    } // end main
} // end StudentListDriver
