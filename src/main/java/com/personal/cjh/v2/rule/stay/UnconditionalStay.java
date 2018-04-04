/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.rule.stay;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * 무조건 STAY 규칙
 */
public class UnconditionalStay implements Stay {
    @Override
    public boolean isStay(List<Pair<Suit, Denomination>> hand) {
        System.out.println("UnconditionalStay");
        return false;
    }
}
