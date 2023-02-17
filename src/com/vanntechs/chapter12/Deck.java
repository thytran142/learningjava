package com.vanntechs.chapter12;

/***********************************************
 * Deck.java
 * Dean & Dean
 *
 * This represents a deck of cards.
 ***********************************************/

public class Deck extends GroupOfCards
{
    public static final int TOTAL_CARDS = 52;

    //********************************************

    public Deck()
    {
        for (int i=0; i<TOTAL_CARDS; i++)
        {
            addCard(new Card((2 + i%13), i/13));
        }
    } // end constructor

    //********************************************

    public void shuffle()
    {
        System.out.println("In Deck's shuffle");
    }

    //********************************************

    public Card dealCard()
    {
        System.out.println("In Deck's dealCard");
        removeCard();
        return null;
    }
} // end class Deck