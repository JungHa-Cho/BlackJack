/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.user;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Hand;
import com.personal.cjh.v2.card.Suit;
import com.personal.cjh.v2.rule.Rules;
import com.personal.cjh.v2.rule.ace.Ace;
import com.personal.cjh.v2.rule.hit.Hit;
import com.personal.cjh.v2.rule.stay.Stay;
import org.apache.commons.lang3.tuple.Pair;

public class User extends Hand {
    Rules ruleChecker;

    User(Hit hit, Stay stay, Ace ace) {
        ruleChecker = new Rules(hit, stay, ace);
    }

    public void showCard() {
        for (Pair<Suit, Denomination> card : getHand()) {
            int i = 0;
            System.out.print("[" + card.getLeft() + ", " + card.getRight() + "] ");
        }
        System.out.println();
    }

    int counting() {
        return ruleChecker.calculate(getHand());
    }
}
