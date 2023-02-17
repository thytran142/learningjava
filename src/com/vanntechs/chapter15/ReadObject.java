package com.vanntechs.chapter15;

/**************************************************************
 * ReadObject.java
 * Dean & Dean
 *
 * This reads two objects from a binary file.
 **************************************************************/

import java.io.*;
import java.util.Scanner;

public class ReadObject
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        ObjectInputStream fileIn = null;
        TestObject testObject;

        System.out.print("Enter filename: ");
        try
        {
            fileIn = new ObjectInputStream(
                    new FileInputStream(stdIn.nextLine()));
            testObject = (TestObject) fileIn.readObject();
            testObject.display();
            testObject = (TestObject) fileIn.readObject();
            testObject.display();
            fileIn.close();
        }
        catch (IOException e)
        {
            System.out.println("IO Error: " + e.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("ClassNotFound " + e.getMessage());
        }
    } // end main
} // end ReadObject class