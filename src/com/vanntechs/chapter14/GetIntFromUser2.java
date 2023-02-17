package com.vanntechs.chapter14;

/*******************************************
 * GetIntFromUser2.java
 * Dean & Dean
 *
 * Figure 14.6
 *******************************************/

import java.util.Scanner;

public class GetIntFromUser2
{
    public static int getIntFromUser()
    {
        Scanner stdIn = new Scanner(System.in);
        String xStr; // user entry
        boolean valid = false; // is user entry a valid integer?
        int x = 0; // integer form of user entry

        System.out.print("Enter an integer: ");
        xStr = stdIn.next();
        do
        {
            try
            {
                x = Integer.parseInt(xStr);
                valid = true;
            }
            catch (NumberFormatException nfe)
            {
                System.out.print("Invalid entry. Enter an integer: ");
                xStr = stdIn.next();
            }
        } while (!valid);
        return x;
    } // end getIntFromUser

    //************************************

    public static void main(String[] args)
    {
        System.out.println(getIntFromUser());
    }
}