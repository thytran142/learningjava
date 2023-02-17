package com.vanntechs.chapter4;

/******************************************************************
 * SentenceTester.java
 * Dean & Dean
 *
 * This program checks for period at the end of line of input.
 *******************************************************************/

import java.util.Scanner;

public class SentenceTester
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String sentence;
        int lastCharPosition;

        System.out.println("Enter a sentence:");
        sentence = stdIn.nextLine();
        lastCharPosition = sentence.length() - 1;
        if (sentence.charAt(lastCharPosition) != '.')
        {
            System.out.println(
                    "Invalid entry - your sentence needs a period!");
        }
    } // end main
} // end class SentenceTester