package com.vanntechs.chapter9;

/********************************************************
 * Shirt.java
 * Dean & Dean
 *
 * This class stores and displays color choices for
 * a sports-uniform shirt.
 ********************************************************/

import java.util.Scanner;

public class Shirt
{
    private String name;    // person's name
    private String primary; // shirt's primary color
    private String trim;    // shirt's trim color

    //*****************************************************

    public Shirt()
    {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("Enter person's name: ");
        this.name = stdIn.nextLine();

        this.primary = selectColor("primary");
        this.trim = selectColor("trim");
    } // end constructor

    //*****************************************************

    public void display()
    {
        System.out.println(this.name + "'s shirt:\n" +
                this.primary + " with " + this.trim + " trim");
    } // end display

    //*****************************************************

    // Helper method prompts for and inputs user's selection

    private String selectColor(String colorType)
    {
        Scanner stdIn = new Scanner(System.in);
        String color; // chosen color, first a letter, then a word

        do
        {
            System.out.print("Enter shirt's " + colorType +
                    " color (w, r, y): ");
            color = stdIn.nextLine();
        } while (!color.equals("w") && !color.equals("r") &&
                !color.equals("y"));

        switch (color.charAt(0))
        {
            case 'w':
                color = "white";
                break;
            case 'r':
                color = "red";
                break;
            case 'y':
                color = "yellow";
        } // end switch

        return color;
    } // end selectColor
} // end class Shirt