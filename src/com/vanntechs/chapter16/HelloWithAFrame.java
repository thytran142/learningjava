package com.vanntechs.chapter16;

/************************************************
 * HelloWithAFrame.java
 * Dean & Dean
 *
 * This displays a Hello box in a frame.
 ************************************************/

import javax.swing.*;

public class HelloWithAFrame extends JFrame
{
    public HelloWithAFrame()
    {
        setTitle("Hello");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    } // end HelloWithAFrame constructor

    //***********************************************************

    public static void main(String[] args)
    {
        HelloWithAFrame helloFrame = new HelloWithAFrame();
        JOptionPane.showMessageDialog(helloFrame, "Hello, world!");
    } // end main
} // end class HelloWithAFrame