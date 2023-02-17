package com.vanntechs.chapter16;

/********************************************************
 * DragSmiley.java
 * Dean & Dean
 *
 * This program displays a smiley face image.
 * When the user presses the mouse, the image changes to a
 * scared image. The user can drag the image.
 ********************************************************/

import javax.swing.*;

public class DragSmiley extends JFrame
{
    private static final int WIDTH = 250;
    private static final int HEIGHT = 250;
    private SmileyPanel smileyPanel;      // drawing panel

    //*****************************************************

    public DragSmiley()
    {
        setTitle("Drag Smiley");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        smileyPanel = new SmileyPanel();
        add(smileyPanel);
        setVisible(true);
    } // end DragSmiley constructor

    //**************************************

    public static void main(String[] args)
    {
        new DragSmiley();
    }
} // end class DragSmiley