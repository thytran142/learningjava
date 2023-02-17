package com.vanntechs.chapter15;

/*************************************************
 * FileSizes.java
 * Dean & Dean
 *
 * This program displays the names and sizes of
 * files in the current directory.
 *************************************************/

import java.io.*;

public class FileSizes
{
    public static void main(String[] args)
    {
        File currentDirectory = new File(".");
        File[] files = currentDirectory.listFiles();

        for (int i=0; i<files.length; i++)
        {
            System.out.printf("%-25s%6d bytes\n",
                    files[i].getName(), files[i].length());
        }
    } // end main
} // end FileSizes class
