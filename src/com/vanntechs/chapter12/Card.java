package com.vanntechs.chapter12;

/**************************************************
 * Card.java
 * Dean & Dean
 *
 * This describes a single playing card.
 **************************************************/

public class Card
{
    private int num;
    private int suit;

    //***********************************************

    public Card(int num, int suit)
    {
        this.num = num;
        this.suit = suit;
    } // end constructor

    //***********************************************

    public void display()
    {
        System.out.println(num + "\t" + suit);
    } // end display
} // end Card
