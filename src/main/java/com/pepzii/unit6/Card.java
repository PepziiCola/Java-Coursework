package com.pepzii.unit6;

public class Card {

    private final int num;
    private final char suit;

    public Card(int num, char suit) {
        this.num = num;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return Integer.toString(num) + suit;
    }
}
