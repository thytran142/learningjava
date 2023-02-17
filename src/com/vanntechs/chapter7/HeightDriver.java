package com.vanntechs.chapter7;

/*******************************************************************
 * HeightDriver.java
 * Dean & Dean
 *
 * This class is a demonstration driver for the Height class.
 *******************************************************************/

public class HeightDriver
{
    public static void main(String[] args)
    {
        Height myHeight = new Height();

        myHeight.setHeight(72.0, "in");
        myHeight.print();
        myHeight.setHeight(180.0);
        myHeight.print();
    } // end main
} // end class HeightDriver