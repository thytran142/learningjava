package com.vanntechs.chapter14;

/***************************************************************
 * LinePlotPanel.java
 * Dean & Dean
 *
 * This class displays a line as a sequence of connected points.
 ***************************************************************/

import javax.swing.*; // for JPanel
import java.awt.*;    // for Graphics

public class LinePlotPanel extends JPanel
{
    private int[] xPixels; // holds x value for each plotted point
    private int[] yPixels; // holds y value for each plotted point

    // Line plot is surrounded by a rectangle with these specs:
    private int topLeftX, topLeftY;
    private int rectWidth, rectHeight;

    //************************************************************

    // Calculate dimensions for the line-plot rectangle, using the
    // passed-in frame, which contains the frame's dimensions and
    // coordinate values. Fill in xPixels and yPixels arrays.

    public LinePlotPanel(LinePlotGUI frame)
    {
        int numOfPoints = frame.getYCoords().length;
        int pixelInterval;   // distance between adjacent points

        topLeftX = topLeftY = frame.getMargin();

        // getInsets works only if setVisible is called first
        frame.setVisible(true);
        rectWidth =
                frame.getWidth() - (2 * topLeftX +
                        frame.getInsets().left + frame.getInsets().right);
        rectHeight =
                frame.getHeight() - (2 * topLeftY +
                        frame.getInsets().top + frame.getInsets().bottom);

        // Calculate integer pixel interval between adjacent points
        pixelInterval = rectWidth / (numOfPoints - 1);

        // Make rectangle's actual width = multiple of pixelInterval
        rectWidth = (numOfPoints - 1) * pixelInterval;

        xPixels = new int[numOfPoints];
        yPixels = new int[numOfPoints];

        for (int i=0; i<numOfPoints; i++)
        {
            xPixels[i] = topLeftX + (i * pixelInterval);
            yPixels[i] = topLeftY + rectHeight - (int) Math.round(
                    (frame.getYCoords()[i] / frame.getMaxY()) * rectHeight);
//        frame.getYCoords()[i] * rectHeight / frame.getMaxY());
        }
    } // end LinePlotPanel constructor

    //**********************************************************

    // This class displays line as sequence of connected points.

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawRect(topLeftX, topLeftY, rectWidth, rectHeight);
        g.drawPolyline(xPixels, yPixels, xPixels.length);
    } // end paintComponent
} // end class LinePlotPanel
