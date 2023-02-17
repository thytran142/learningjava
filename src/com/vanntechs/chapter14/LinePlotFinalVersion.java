package com.vanntechs.chapter14;

/***************************************************************
 * LinePlotFinalVersion.java
 * Dean & Dean
 *
 * This program plots a line as a series of user-specified
 * line segments.
 ***************************************************************/

import java.util.Scanner;

public class LinePlotFinalVersion
{
    private int oldX = 0;  // oldX and oldY save previous point
    private int oldY = 0;  // starting point is the origin (0,0)

    //************************************************************

    // This method prints description of a line segment from the
    // previous point to the current point.

    public void plotSegment(int x, int y)
    {
        System.out.println("New segment = (" + oldX + "," + oldY +
                ")-(" + x + "," + y + ")");
        oldX = x;
        oldY = y;
    } // end plotSegment

    //************************************************************

    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        LinePlot line = new LinePlot();
        String xStr, yStr;   // coordinates for point in String form
        int x, y;            // coordinates for point

        System.out.print("Enter x & y coordinates (q to quit): ");
        xStr = stdIn.next();

        while (!xStr.equalsIgnoreCase("q"))
        {
            yStr = stdIn.next();
            try
            {
                x = Integer.parseInt(xStr);
                y = Integer.parseInt(yStr);
                line.plotSegment(x, y);
            }
            catch (NumberFormatException nfe)
            {
                System.out.println("Invalid entry: " + xStr + " " + yStr
                        + "\nMust enter integer space integer.");
            }
            System.out.print("Enter x & y coordinates (q to quit): ");
            xStr = stdIn.next();
        } // end while

    } // end main
} // end class LinePlotFinalVersion
