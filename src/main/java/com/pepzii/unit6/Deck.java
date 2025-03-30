package com.pepzii.unit6;

import java.util.ArrayList;

public class Deck {

    private final ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();

        for (char suit : new char[]{'C', 'D', 'H', 'S'}) {
            for (int i = 1; i <= 13; i++) {
                cards.add(new Card(i, suit));
            }
        }
    }

    public Card dealCard() {
        return cards.remove(cards.size() - 1);
    }

    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < cards.size(); i++) {
            output += cards.get(i).toString();

            if ((i + 1) % 5 == 0) output += "\n";
            else output += " ";
        }

        return output;
    }
}