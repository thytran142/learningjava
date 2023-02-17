package com.vanntechs.chapter14;

/*******************************************************
 * CreateNewFileFinalVersion.java
 * Dean & Dean
 *
 * This creates a new file with try and immediate verify.
 *******************************************************/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CreateNewFileFinalVersion
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String fileName; // user-specified file name
        File file;

        System.out.print("Enter file to be created: ");
        fileName = stdIn.nextLine();
        file = new File(fileName);

        if (file.exists())
        {
            System.out.println("Sorry, file already exists.");
        }
        else
        {
            try
            {
                file.createNewFile();
                System.out.println(fileName + " created.");
            }
            catch (IOException ioe)
            {
                System.out.println("File I/O error");
            }
        }
    } // end main
} // end CreateNewFileFinalVersion class