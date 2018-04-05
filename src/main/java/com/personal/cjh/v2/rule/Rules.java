/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.rule;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import com.personal.cjh.v2.rule.ace.Ace;
import com.personal.cjh.v2.rule.hit.Hit;
import com.personal.cjh.v2.rule.stay.Stay;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public class Rules {
    private Hit hit;
    private Stay stay;
    private Ace ace;

    public Rules(Hit hit, Stay stay, Ace ace) {
        this.hit = hit;
        this.stay = stay;
        this.ace = ace;
    }

    public int calculate(List<Pair<Suit, Denomination>> hand) {
        int aceElevenCounting = 0;
        int aceOneCounting = 0;
        int aceCardCounting = 0;

        for (Pair<Suit, Denomination> card : hand) {
            if (card.getRight() == Denomination.ACE) {
                aceElevenCounting += 11;
                aceOneCounting += 1;
                aceCardCounting++;
            } else {
                aceElevenCounting += card.getRight().getProperty();
                aceOneCounting += card.getRight().getProperty();
            }
        }

        if (aceElevenCounting <= 21) {
            return aceElevenCounting;
        } else if (aceElevenCounting > 21) {
            if (aceCardCounting > 0) {
                int temp = aceElevenCounting;
                for (int i = 0; i < 4; i++) {
                    temp = temp - 10;
                    if (temp <= 21) return temp;
                }
                return aceElevenCounting;
            } else {
                return aceElevenCounting;
            }
        }
        return 0;
    }

    private boolean isHit(List<Pair<Suit, Denomination>> hand) {
        return hit.isHit(hand);
    }

    private boolean isAce(List<Pair<Suit, Denomination>> hand) {
        return ace.isEleven(hand);
    }

    private boolean isStay(List<Pair<Suit, Denomination>> hand) {
        return stay.isStay(hand);
    }
}
