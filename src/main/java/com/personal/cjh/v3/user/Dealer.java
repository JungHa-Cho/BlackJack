/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.user;

import com.personal.cjh.v3.Game;
import com.personal.cjh.v3.card.Card;
import com.personal.cjh.v3.card.Hand;

public class Dealer implements User {
    private Hand hand;
    private Game blackJack;

    public Dealer(Game game) {
        hand = new Hand();
        blackJack = game;
    }

    @Override
    public void hit(Card card) {
        hand.receive(card);
    }

    @Override
    public void stay() {

    }

    @Override
    public int counting() {
        return 0;
    }

    public Card drawDeck() {
        return blackJack.drawDeck();
    }
}
