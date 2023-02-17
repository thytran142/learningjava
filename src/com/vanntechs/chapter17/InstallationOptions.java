package com.vanntechs.chapter17;

/******************************************
 * InstallationOptions
 * Dean & Dean
 *
 * This program displays installation options using
 * check boxes and radio buttons.
 ******************************************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class InstallationOptions extends JFrame
{
    private static final int WIDTH = 270;
    private static final int HEIGHT = 270;

    JRadioButton standard;
    JRadioButton custom;
    JCheckBox prior;
    JCheckBox diskSpace;
    JCheckBox updates;
    JCheckBox spyware;

    //**************************************

    public InstallationOptions()
    {
        setSize(WIDTH, HEIGHT);
        setTitle("TaxLoophole Pro, v. 3.1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    } // end JobApplication constructor

    //**************************************

    // Create components and add to window.

    private void createContents()
    {
        JButton continueBtn = new JButton("Continue");
        ButtonGroup rbGroup = new ButtonGroup();

        // Note:
        // The most straightforward implementation is to use a
        // GridLayout manager for the JFrame and add all components
        // to its cells. That doesn't work well because:
        // 1) Can't apply a margin to JFrame.
        // 2) The button gets cut off because, being in a panel, its
        //    height isn't used when row heights are calculated.

        // Need windowPanel for south-panel separation and outer margin.
        JPanel windowPanel = new JPanel(new BorderLayout(0, 10));
        windowPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // centerPanel holds all components except button
        JPanel centerPanel = new JPanel(new GridLayout(9, 1));

        // Need a panel for button so it can be center aligned
        JPanel southPanel = new JPanel(new FlowLayout());

        standard = new JRadioButton("Standard (recommended)", true);
        custom = new JRadioButton("Custom");
        standard.addActionListener(new Listener());
        custom.addActionListener(new Listener());

        prior = new JCheckBox("Check for prior-version software.", true);
        diskSpace = new JCheckBox("Check for available disk space.", true);
        updates = new JCheckBox("Receive automatic updates.");
        spyware = new JCheckBox("Install spyware so we can track you.");
        prior.setEnabled(false);
        diskSpace.setEnabled(false);
        updates.setEnabled(false);
        spyware.setEnabled(false);

        centerPanel.add(new JLabel("Installation options:"));
        centerPanel.add(new Label());   // filler
        rbGroup.add(standard);
        rbGroup.add(custom);
        centerPanel.add(standard);
        centerPanel.add(custom);
        centerPanel.add(new Label());   // filler
        centerPanel.add(prior);
        centerPanel.add(diskSpace);
        centerPanel.add(updates);
        centerPanel.add(spyware);
        windowPanel.add(centerPanel, BorderLayout.CENTER);
        southPanel.add(continueBtn);
        windowPanel.add(southPanel, BorderLayout.SOUTH);
        add(windowPanel);
    } // end createContents

    //***************************************

    // Inner class for handling standard vs. custom installation

    private class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == standard) // standard option chosen
            {
                prior.setEnabled(false);
                diskSpace.setEnabled(false);
                updates.setEnabled(false);
                spyware.setEnabled(false);
                prior.setSelected(true);
                diskSpace.setSelected(true);
                updates.setSelected(false);
                spyware.setSelected(false);
            }
            else                           // custom option chosen
            {
                prior.setEnabled(true);
                diskSpace.setEnabled(true);
                updates.setEnabled(true);
                spyware.setEnabled(true);
            }
        } // end actionPerformed
    } // end Listener

    //**************************************

    public static void main(String[] args)
    {
        new InstallationOptions();
    }
} // end class InstallationOptions