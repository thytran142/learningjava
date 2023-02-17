package com.vanntechs.chapter14;

/****************************************************************
 * PrintLineFromFile2.java
 * Dean & Dean
 *
 * This opens an existing text file and prints a line from it.
 ****************************************************************/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PrintLineFromFile2
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

        catch (FileNotFoundException e)
        {
            System.out.println("Invalid filename: " + fileName);
        }
        catch (IOException e)
        {
            System.out.println("Error reading from file: " + fileName);
        }
    } // end main
} // end PrintLineFromFile2 class