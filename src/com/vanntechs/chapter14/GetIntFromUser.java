package com.vanntechs.chapter14;

/*******************************************
 * GetIntFromUser.java
 * Dean & Dean
 *
 * Figure 14.5
 *******************************************/

import java.util.Scanner;

public class GetIntFromUser
{
    public static int getIntFromUser()
    {
        Scanner stdIn = new Scanner(System.in);
        String xStr; // user entry
        boolean valid; // is user entry a valid integer?
        int x; // integer form of user entry

        System.out.print("Enter an integer: ");
        xStr = stdIn.next();
        do
        {
            try
            {
                valid = false;
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