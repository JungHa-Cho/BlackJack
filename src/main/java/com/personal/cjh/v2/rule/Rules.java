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
    Hit hit;
    Stay stay;
    Ace ace;

    public Rules(Hit hit, Stay stay, Ace ace) {
        this.hit = hit;
        this.stay = stay;
        this.ace = ace;
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
