package com.vanntechs.chapter12;

/*******************************************************
 * GroupOfCards.java
 * Dean & Dean
 *
 * This is a base class for the Card Game program.
 *******************************************************/

import java.util.ArrayList;

public class GroupOfCards
{
    private ArrayList<Card> cards = new ArrayList<Card>();
    private int currentSize = 0;

    //********************************************

    public int getCurrentSize()
    {
        return currentSize;
    }

    //****************************************************

    public void addCard(Card card)
    {
        cards.add(card);
        currentSize++;
    } // end addCard

    //****************************************************

    public Card removeCard()
    {
        System.out.println("In removeCard");
        currentSize--;
        return null;
    } // end addCard

    //****************************************************

    public void display()
    {
        System.out.println("NUM \tSUIT");
        for (int i=0; i<currentSize; i++)
        {
            cards.get(i).display();
        }
    } // end display
} // end GroupOfCards