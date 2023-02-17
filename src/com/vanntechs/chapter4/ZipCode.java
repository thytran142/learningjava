package com.vanntechs.chapter4;

/****************************************************************
 * ZipCode.java
 * Dean & Dean
 *
 * This program identifies geographical region from ZIP Code.
 ******************************************************************/

import java.util.Scanner;

public class ZipCode
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String zip; // user-entered ZIP Code

        System.out.print("Enter a ZIP Code: ");
        zip = stdIn.nextLine();
        switch (zip.charAt(0))
        {
            case '0': case '2': case '3':
            System.out.println(zip + " is on the East Coast.");
            break;
            case '4': case '5': case '6':
            System.out.println(
                    zip + " is in the Central Plains area.");
            break;
            case '7':
                System.out.println(zip + " is in the South.");
                break;
            case '8': case '9':
            System.out.println(zip + " is in the West.");
            break;
            default:
                System.out.println(zip + " is an invalid ZIP Code.");
        } // end switch
    } // end main
} // end class ZipCode