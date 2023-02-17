package com.vanntechs.chapter17;

/******************************************
 * LicenseAgreement.java
 * Dean & Dean
 *
 * This program displays a software license agreement.
 ******************************************/

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class LicenseAgreement extends JFrame
{
    private static final int WIDTH = 400;
    private static final int HEIGHT = 200;

    public LicenseAgreement()
    {
        setTitle("TaxLoophole Professional, Version 3.1");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    } // end LicenseAgreement constructor

    //**************************************

    // Create components and add to window.

    private void createContents()
    {
        JTextArea license;
        JCheckBox confirmBox;

        setLayout(new BorderLayout());
        license = new JTextArea(
                "SOFTWARE END-USER LICENSE AGREEMENT\n\n" +
                        "READ CAREFULLY: This Software End-User License Agreement" +
                        " is a legal agreement between us, the software provider, and" +
                        " you, the end user of a software product legitimately" +
                        " purchased from us. You must accept this agreement to" +
                        " complete the sale of the software license. If you do not" +
                        " accept this agreement, you forfeit all rights to your" +
                        " current and future property and progeny.");
        license.setEditable(false);
        license.setLineWrap(true);
        license.setWrapStyleWord(true);
        // license.setMargin(new Insets(10, 10, 10, 10));
        // license.setBackground(getContentPane().getBackground());
        confirmBox = new JCheckBox(
                "I accept the terms of this agreement.", true);
        // confirmBox.setMargin(new Insets(10, 10, 10, 10));

        add(license, BorderLayout.CENTER);
        add(confirmBox, BorderLayout.SOUTH);

        // This program's first iteration omits the following:
        license.setBackground(getContentPane().getBackground());
    } // end createContents

    //**************************************

    public static void main(String[] args)
    {
        new LicenseAgreement();
    }
} // end class LicenseAgreement