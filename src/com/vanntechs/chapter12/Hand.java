package com.vanntechs.chapter12;

/***************************************************
 * Hand.java
 * Dean & Dean
 *
 * Prototype for one player in a card game.
 ***************************************************/

public class Hand extends GroupOfCards
{

    //************************************************

    public void sort()
    {
        System.out.println("In Hand's sort");
    }

    //************************************************

    public void addCard(Card card)
    {
        System.out.println("In Hand's addCard " + card);
    }

    //************************************************

    public Card playACard()
    {
        System.out.println("In Hand's playACard");
        removeCard();
        return null;
    }
} // end Hand