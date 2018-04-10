/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3;

import com.personal.cjh.v3.card.Card;
import com.personal.cjh.v3.card.Deck;

public class Game {
    private Deck deck;

    public Game() {
        deck = new Deck();
    }

    public void start() {
    }

    public void initializeGame() {
    }

    public Card drawDeck() {
        return deck.drawCard();
    }
}
