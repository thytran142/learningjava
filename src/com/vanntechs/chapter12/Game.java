package com.vanntechs.chapter12;

/****************************************************
 * Game.java
 * Dean & Dean
 *
 * This exercises preliminary code fragments.
 ****************************************************/

public class Game
{
    private Deck deck = new Deck();
    private Hand player1 = new Hand();
    private Hand player2 = new Hand();

    public void playAGame()
    {
        deck.display();              // for debugging
        deck.shuffle();

        // Deal all the cards to the two players.
        while (deck.getCurrentSize() > 0)
        {
            player1.addCard(deck.dealCard());
            player2.addCard(deck.dealCard());
        }
    } // end playAGame
} // end Game