package com.vanntechs.chapter4;

/******************************************************************
 * FreeFries.java
 * Dean & Dean
 *
 * This program reads points scored by the home team and the
 * opposing team and determines whether the fans win free
 * french fries.
 *******************************************************************/

import java.util.Scanner;

public class FreeFries
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        int homePts; // points scored by home team
        int opponentPts; // points scored by opponents

        System.out.print("Home team points scored: ");
        homePts = stdIn.nextInt();
        System.out.print("Opposing team points scored: ");
        opponentPts = stdIn.nextInt();

        if (homePts > opponentPts && homePts >= 100)
        {
            System.out.println("Fans: Redeem your ticket stub for" +
                    " a free order of French fries at Yummy Burgers.");
        }
    } // end main
} // end class FreeFries