package com.vanntechs.chapter15;

/******************************************************
 * WriteTextFile.java
 * Dean & Dean
 *
 * This writes a string to a text file.
 ******************************************************/

import java.util.Scanner;
import java.io.*;

public class WriteTextFile
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        PrintWriter fileOut;
        String text = "Hello, world!";

        try
        {
            System.out.print("Enter filename: ");
            fileOut = new PrintWriter(stdIn.nextLine());
            fileOut.println(text);
            fileOut.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    } // end main
} // end WriteTextFile class