package com.vanntechs.chapter15;

/****************************************************************
 * WriteTextFile2.java
 * Dean & Dean
 *
 * This appends data to an existing text file.
 ****************************************************************/

import java.util.Scanner;
import java.io.*;

public class WriteTextFile2
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        PrintWriter fileOut;
        String text = "Hello, world!";

        try
        {
            System.out.print("Enter filename: ");
            fileOut =
                    new PrintWriter(new FileWriter(stdIn.nextLine(), true));
            fileOut.println(text);
            fileOut.close();
        }
        catch (IOException e)
        {
            System.out.println("IO: " + e.getMessage());
        }
    } // end main
} // end WriteTextFile2 class
