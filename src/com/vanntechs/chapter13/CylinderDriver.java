package com.vanntechs.chapter13;

/**************************************************************
 * CylinderDriver.java
 * Dean & Dean
 *
 * This drives the Cylinder class.
 **************************************************************/

import java.util.Scanner;
import javax.swing.*;    // for JFrame and JPanel

public class CylinderDriver
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        JFrame frame = new JFrame("Three-Dimensional Cylinder");
        Cylinder cylinder;
        double elev;    // cylinder axis elevation angle in degrees
        double azmuth;  // cylinder axis azmuth angle in degrees

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.print("Enter axis elevation (-90 to +90): ");
        elev = stdIn.nextDouble();
        System.out.print("Enter axis azmuth (-90 to +90): ");
        azmuth = stdIn.nextDouble();
        cylinder = new Cylinder(elev, azmuth);
        frame.add(cylinder);
        frame.setVisible(true);
    } // end main
} // end CylinderDriver class