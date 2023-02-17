package com.vanntechs.chapter9;

/********************************************************************
 * CalendarDemo.java
 * Dean & Dean
 *
 * This program demonstrates how to use the Calendar class.
 ********************************************************************/

import java.util.*;               // for Scanner and Calendar

public class CalendarDemo
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        Calendar time = Calendar.getInstance();   // initially now
        int day;                                  // day of year
        int hour;                                 // hour of day

        System.out.println(time.getTime());
        day = time.get(time.DAY_OF_YEAR);
        hour = time.get(time.HOUR_OF_DAY);
        System.out.println("day of year= " + day);
        System.out.println("hour of day= " + hour);
        System.out.print("Enter number of days to add: ");
        day += stdIn.nextInt();
        System.out.print("Enter number of hours to add: ");
        hour += stdIn.nextInt();
        time.set(time.DAY_OF_YEAR, day);
        time.set(time.HOUR_OF_DAY, hour);
        System.out.println(time.getTime());
    } // end main
} // end class CalendarDemo