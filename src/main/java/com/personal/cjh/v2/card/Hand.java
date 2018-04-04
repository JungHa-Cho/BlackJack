/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.card;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * 각 유저가 들고 있는 핸드, 카드의 집합
 */
public class Hand {
    private List<Pair<Suit, Denomination>> hand;

    protected Hand() {
        hand = new ArrayList<>();
    }

    public void receiveCard(Pair<Suit, Denomination> card) {
        hand.add(card);
    }

    protected List<Pair<Suit, Denomination>> getHand() {
        return hand;
    }
}
