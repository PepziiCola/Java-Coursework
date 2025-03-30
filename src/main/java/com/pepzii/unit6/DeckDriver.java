// Write a complete program that implements the functionality of a deck of cards.
// In writing your program, use the provided DeckDriver and Card classes shown below.
// Write your own Deck class so that it works in conjunction with the two given classes.
// Use anonymous objects where appropriate.

package com.pepzii.unit6;

public class DeckDriver {

    public static void main(String[] args) {

        final Deck deck = new Deck();

        System.out.println(deck.dealCard());

        System.out.println(deck.dealCard());

        System.out.println();

        System.out.println(deck);

    } // end main

} // end DeckDriver class