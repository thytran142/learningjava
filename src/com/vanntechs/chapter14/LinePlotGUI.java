package com.vanntechs.chapter14;

/****************************************************************
 * LinePlotGUI.java
 * Dean & Dean
 *
 * This program plots a line as a sequence of connected,
 * user-specified points.
 ****************************************************************/

import javax.swing.*;   // for JFrame, JOptionPane

public class LinePlotGUI extends JFrame
{
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 250;
    private static final int MARGIN = 20; // space between frame
    // and line plot
    int numOfPoints;  // points go from N=0 to N=numOfPoints-1
    int maxY;         // y coordinate values go from y=0 to y=maxY
    double[] yCoords; // y coordinate values for all the points

    //*************************************************************

    public LinePlotGUI()
    {
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Line Plot");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // end LinePlotGUI

    //*************************************************************

    int getMargin()
    {
        return MARGIN;
    }

    double getMaxY()
    {
        return maxY;
    }

    double[] getYCoords()
    {
        return yCoords;
    }

    //*************************************************************

    // This method prompts the user for y coordinates for points
    // at positions x=0, x=1, etc.

    public void readYCoordinates()
    {
        String yStr; // user's entry for a point's y coordinate

        numOfPoints = getIntFromUser("Enter number of points: ");
        maxY = getIntFromUser("Enter maximum point value: ");
        yCoords = new double[numOfPoints];
        for (int i=0; i<numOfPoints; i++)
        {
            yStr = JOptionPane.showInputDialog(
                    "At N = " + i + ", what is y's value?\n" +
                            "Enter an number between 0 and " +
                            maxY + " inclusive:");
            try
            {
                yCoords[i] = Double.parseDouble(yStr);
                if (yCoords[i] < 0.0 || yCoords[i] > maxY)
                {
                    JOptionPane.showMessageDialog(null,
                            "Invalid entry. Value must be between 0 and " + maxY);
                    i--;
                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,
                        "Invalid entry. Must enter an integer.");
                i--;
            }
        } // end for
    } // end readYCoordinates

    //*************************************************************

    // This method prompts the user for an integer, performs input
    // validation, and returns the entered integer.

    private static int getIntFromUser(String prompt)
    {
        String entry; // user entry
        boolean valid = false; // is user entry a valid integer?
        int entryInt = 0; // integer form of user entry

        entry = JOptionPane.showInputDialog(prompt);
        do
        {
            try
            {
                entryInt = Integer.parseInt(entry);
                valid = true;
            }
            catch (NumberFormatException e)
            {
                entry = JOptionPane.showInputDialog(
                        "Invalid entry. Enter an integer:");
            }
        } while (!valid);
        return entryInt;
    } // end getIntFromUser

    //*************************************************************

    public static void main(String[] args)
    {
        LinePlotGUI linePlotGUI = new LinePlotGUI();
        linePlotGUI.readYCoordinates();
        LinePlotPanel linePlotPanel = new LinePlotPanel(linePlotGUI);
        linePlotGUI.add(linePlotPanel);
        linePlotGUI.setVisible(true);
    } // end main
} // end class LinePlotGUI
