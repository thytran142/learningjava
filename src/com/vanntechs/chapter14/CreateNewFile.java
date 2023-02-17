package com.vanntechs.chapter14;

/*******************************************************
 * CreateNewFile.java
 * Dean & Dean
 *
 * This creates a new file.
 *******************************************************/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CreateNewFile
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
            file.createNewFile();
            System.out.println(fileName + " created.");
        }
    } // end main
} // end CreateNewFile class
