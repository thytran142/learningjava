package com.vanntechs.chapter15;

/*******************************************************
 * HTMLGenerator.java
 * Dean & Dean
 *
 * This program copies the contents of a user-specified
 * file and pastes it into a newly generated HTML file.
 *******************************************************/

import java.util.Scanner;
import java.io.*;

public class HTMLGenerator
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        String filenameIn;    // original file's name
        Scanner fileIn;       // input file connection
        int dotIndex;         // position of dot in filename
        String filenameOut;   // HTML file's name
        PrintWriter fileOut;  // HTML file connection
        String line;          // a line from the input file

        System.out.print("Enter file's name: ");
        filenameIn = stdIn.nextLine();

        try
        {
            fileIn = new Scanner(new FileReader(filenameIn));

            // Compose the new filename
            dotIndex = filenameIn.lastIndexOf(".");
            if (dotIndex == -1) // no dot found
            {
                filenameOut = filenameIn + ".html";
            }
            else // dot found
            {
                filenameOut =
                        filenameIn.substring(0, dotIndex) + ".html";
            }
            fileOut = new PrintWriter(filenameOut);

            // First line used for title and header elements
            line = fileIn.nextLine();
            if (line == null)
            {
                System.out.println(filenameIn + " is empty.");
            }
            else
            {
                // Write the top of the HTML page.
                fileOut.println("<html>");
                fileOut.println("<head>");
                fileOut.println("<title>" + line + "</title>");
                fileOut.println("</head>");
                fileOut.println("<body>");
                fileOut.println("<h1>" + line + "</h1>");

                while (fileIn.hasNextLine())
                {
                    line = fileIn.nextLine();

                    // Blank lines generate p tags.
                    if (line.isEmpty())
                    {
                        fileOut.println("<p>");
                    } // end if
                    else
                    {
                        fileOut.println(line);
                    }
                } // end while

                // Write ending HTML code.
                fileOut.println("</body>");
                fileOut.println("</html>");
            } // end else
            fileIn.close();
            fileOut.close();
        } // end try

        catch (FileNotFoundException e)
        {
            System.out.println("Error: " + e.getMessage());
        } // end catch
    } // end main
} // end class HTMLGenerator