package com.vanntechs.chapter15;

/***************************************************************
 * FileSizesGUI.java
 * Dean & Dean
 *
 * This displays your computer files in GUI format.
 ***************************************************************/

import java.io.File;
import javax.swing.*;   // for JFileChooser and JOptionPane;

public class FileSizesGUI
{
    public static void main(String[] args)
    {
        File fileDir;       // user-specified file or directory
        int response;       // user's response to GUI prompts
        File[] files;       // array of files in specified directory
        String output = ""; // list of filenames and sizes
        JFileChooser chooser = new JFileChooser(".");

        response = JOptionPane.showConfirmDialog(null,
                "This program displays the filenames and file sizes of" +
                        " specified files.\nWould you like to run the program?",
                "File Sizes", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION)
        {
            chooser.setFileSelectionMode(
                    JFileChooser.FILES_AND_DIRECTORIES);
            response = chooser.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION)
            {
                fileDir = chooser.getSelectedFile();
                if (fileDir.isFile())
                {
                    output += String.format("%-25s%12s%n",
                            fileDir.getName(), fileDir.length() + " bytes");
                }
                else if (fileDir.isDirectory())
                {
                    files = fileDir.listFiles();
                    for (int i=0; i<files.length; i++)
                    {
                        output += String.format("%-25s%12s%n",
                                files[i].getName(), files[i].length() + " bytes");
                    } // end for
                } // end else
                else
                {
                    output = "Invalid entry. Not a file or directory.";
                }
                JOptionPane.showMessageDialog(null, output,
                        "File Sizes", JOptionPane.INFORMATION_MESSAGE);
            } // end if
        } // end if
    } // end main
} // end FileSizesGUI class