/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.user;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import com.personal.cjh.v2.rule.ace.Ace;
import com.personal.cjh.v2.rule.hit.Hit;
import com.personal.cjh.v2.rule.stay.Stay;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dealer extends User {
    private List<Pair<Suit, Denomination>> deck;

    public Dealer(Hit hit, Stay stay, Ace ace) {
        super(hit, stay, ace);
        deck = new ArrayList<>();
    }

    public void shuffleTheCard() {
        for (int i = 0; i < com.personal.cjh.v1.card.Suit.values().length; i++) {
            for (int j = 0; j < com.personal.cjh.v1.card.Denomination.values().length; j++) {
                deck.add(Pair.of(Suit.values()[i], Denomination.values()[j]));
            }
        }
    }

    public Pair<Suit, Denomination> drawCard() {
        Random random = new Random();
        int index = random.nextInt(deck.size());
        Pair<Suit, Denomination> temp = deck.get(index);
        deck.remove(index);
        return temp;
    }

    public void isHit() {
        if(counting() < 17) {
            receiveCard(drawCard());
        }
    }
}
