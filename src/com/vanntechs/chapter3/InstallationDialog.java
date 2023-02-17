package com.vanntechs.chapter3;

/**************************************************************
 * InstallationDialog.java
 * Dean & Dean
 *
 * This program illustrates JOptionPane's message dialog.
 **************************************************************/

import javax.swing.JOptionPane;

public class InstallationDialog
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,
                "Before starting the installation, " +
                        "shut down all applications.");
    }
} // end class InstallationDialog
