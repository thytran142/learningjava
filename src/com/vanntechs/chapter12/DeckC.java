package com.vanntechs.chapter12;

public class DeckC
{
    public static final int TOTAL_CARDS = 52;
    private GroupOfCards groupOfCards;

    public DeckC()
    {
        groupOfCards = new GroupOfCards();
        for (int i=0; i<TOTAL_CARDS; i++)
        {
            groupOfCards.addCard(new Card((2 + i%13), i/13));
        }
    } // end constructor
    //...

} // end class DeckC