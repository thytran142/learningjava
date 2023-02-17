package com.vanntechs.chapter14;

/***********************************************************
 * PrintLineFromFile.java
 * Dean & Dean
 *
 * This opens existing text file and prints a line from it.
 ***********************************************************/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

public class PrintLineFromFile
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String fileName;        // name of target file
        BufferedReader fileIn;  // target file
        String line;            // first line from fileIn

        System.out.print("Enter a filename: ");
        fileName = stdIn.nextLine();

        try
        {
            fileIn = new BufferedReader(new FileReader(fileName));
            line = fileIn.readLine();
            System.out.println("Line 1:\n" + line);
        } // end try

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    } // end main
} // end PrintLineFromFile class
