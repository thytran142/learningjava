package com.vanntechs.chapter14;

/**************************************************
 * WriteToFile.java
 * Dean & Dean
 *
 * Figure 14.17
 **************************************************/

import java.io.*;

public class WriteToFile
{
    public void writeToFile() throws IOException
    {
        PrintWriter fileOut = new PrintWriter("testFile.txt");
        try
        {
            fileOut.printf("%s", "This is a test.");
        }
        finally
        {
            fileOut.close();
        }
    } // end writeToFile

    //***********************************************

    public static void main(String[] args) throws IOException
    {
        WriteToFile writer = new WriteToFile();
        writer.writeToFile();
    }
}
