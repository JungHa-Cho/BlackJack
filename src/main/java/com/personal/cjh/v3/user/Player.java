/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.user;

import com.personal.cjh.v3.card.Card;
import com.personal.cjh.v3.card.Hand;

public class Player implements User {
    private Hand hand;

    Player () {
        hand = new Hand();
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
}
