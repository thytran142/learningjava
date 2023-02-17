package com.vanntechs.chapter5;

/***********************************************************************
 * GraphicsDemo.java
 * Dean & Dean
 *
 * This defines a Java applet that displays an image and graphics.
 ************************************************************************/

import java.awt.*; // for Graphics, Image, and Color classes
import java.applet.Applet;

public class GraphicsDemo extends Applet
{
    public void paint (Graphics g)
    {
        Image image =
                this.getImage(getDocumentBase(),"hurricanes.jpg");

        // display smaller complete image in upper left corner of window
        g.drawImage(image, 0, 0, 427, 284,     // destination topL, botR
                0, 0, 640, 427, this);               // source topL, botR

        // establish color of all lines to be drawn
        g.setColor(Color.BLUE);

        // draw rectangle around region to be expanded
        g.drawRect(200, 60, 120, 120);         // topL, width & height

        // draw lines between corners of rectangles
        g.drawLine(200, 60, 240, 240);         // upper left
        g.drawLine(320, 60, 600, 240);         // upper right
        g.drawLine(200, 180, 240, 600);        // lower left
        g.drawLine(320, 180, 600, 600);        // lower right

        // display expanded part of original image
        g.drawImage(image, 240, 240, 600, 600, // destination topL, botR
                300, 90, 480, 270, this); // source topL, botR

        // draw rectangle around expanded part of image
        g.drawRect(240, 240, 360, 360);        // topL, width & height

        // create BLUE colored oval and write name on it
        g.fillOval(520, 380, 45, 30);          // topL, width & height
        g.setColor(Color.WHITE);               // change color for text
        g.drawString("MAX", 530, 400);         // string & start position
    } // end paint
} // end GraphicsDemo class
