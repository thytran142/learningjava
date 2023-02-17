package com.vanntechs.chapter3;

/***********************************************************************
 * TemperatureConverter.java
 * Dean & Dean
 *
 * This program converts a Fahrenheit temperature to Celsius
 ***********************************************************************/
public class TemperatureConverter
{
    public static void main(String[] args)
    {
        final double FREEZING_POINT = 32.0;
        final double CONVERSION_FACTOR = 5.0 / 9.0;
        double fahrenheit = 50; // temperature in Fahrenheit
        double celsius; // temperature in Celsius

        celsius = CONVERSION_FACTOR * (fahrenheit - FREEZING_POINT);
        System.out.println(fahrenheit + " degrees Fahrenheit = " +
                celsius + " degrees Celsius.");
    } // end main
} // end class TemperatureConverter
