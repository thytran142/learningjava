package com.vanntechs.chapter10;

/********************************************************************
 * PennyJar.java
 * Dean & Dean
 *
 * This class counts pennies for individual penny jars and for
 * all penny jars combined.
 ********************************************************************/

public class PennyJar
{
    public static final int GOAL = 10000;
    private static int allPennies = 0;
    private int pennies = 0;

    //*****************************************************************

    public int getPennies()
    {
        return this.pennies;
    }

    //*****************************************************************

    public void addPenny()
    {
        System.out.println("Clink!");
        this.pennies++;
        PennyJar.allPennies++;
        if (PennyJar.allPennies >= PennyJar.GOAL)
        {
            System.out.println("Time to spend!");
        }
    } // end addPenny

    //*****************************************************************

    public static int getAllPennies()
    {
        return PennyJar.allPennies;
    }
} // end class PennyJar