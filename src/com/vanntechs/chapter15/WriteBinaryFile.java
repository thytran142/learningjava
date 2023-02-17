package com.vanntechs.chapter15;

/****************************************************
 * WriteBinaryFile.java
 * Dean & Dean
 *
 * This writes data to a binary file.
 ****************************************************/

import java.util.*;
import java.io.*;

public class WriteBinaryFile
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        Scanner fileIn;                // text file input
        DataOutputStream fileOut;      // binary file output
        int numRecords = 0;

        try
        {
            // Retrieve data from text file
            System.out.print("Enter source text filename: ");
            fileIn = new Scanner(new FileReader(stdIn.nextLine()));

            // Store data in structured binary file
            System.out.print("Enter destination binary filename: ");
            fileOut = new DataOutputStream(new FileOutputStream(
                    stdIn.nextLine()));

            // Transfer title text
            fileOut.writeChars(fileIn.nextLine());
            fileOut.writeChar(0);

            // Transfer array length
            numRecords = Integer.parseInt(fileIn.nextLine());
            fileOut.writeInt(numRecords);

            // Transfer records
            for (int i=0; i<numRecords; i++)
            {
                fileOut.writeInt(fileIn.nextInt());
                fileOut.writeDouble(fileIn.nextDouble());
            }
            fileIn.close();
            fileOut.close();
        } // end try

        catch(Exception e)
        {
            e.getMessage();
        }
    } // end main
} // end WriteBinaryFile class
