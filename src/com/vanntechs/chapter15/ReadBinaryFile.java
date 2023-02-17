package com.vanntechs.chapter15;

/****************************************************
 * ReadBinaryFile.java
 * Dean & Dean
 *
 * This opens a binary file and reads data from it.
 ****************************************************/

import java.util.*;
import java.io.*;

public class ReadBinaryFile
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        DataInputStream fileIn;
        char ch = 0;
        int numRecords = 0;
        ArrayList<Record> table = new ArrayList<Record>();
        StringBuffer tableName = new StringBuffer();

        System.out.print("Enter filename: ");
        try
        {
            fileIn = new DataInputStream(new FileInputStream(
                    stdIn.nextLine()));
            while((ch = fileIn.readChar()) != 0)
            {
                tableName = tableName.append(ch);
            }
            numRecords = fileIn.readInt();
            for (int i=0; i<numRecords; i++)
            {
                table.add(new Record(
                        fileIn.readInt(), fileIn.readDouble()));
            }
            fileIn.close();
        } // end try

        catch(Exception e)
        {
            e.getMessage();
        }
        System.out.println(tableName + "\n" + numRecords);
        for (int i=0; i<numRecords; i++)
        {
            System.out.println(table.get(i).integerValue +
                    "\t" + table.get(i).floatingValue);
        }
    } // end main
} // end ReadBinaryFile class