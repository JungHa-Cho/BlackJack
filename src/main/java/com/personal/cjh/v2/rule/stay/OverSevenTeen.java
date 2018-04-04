/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.rule.stay;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * 딜러 룰
 * 17 이상이면 무조건 Stay
 */
public class OverSevenTeen implements Stay {
    @Override
    public boolean isStay(List<Pair<Suit, Denomination>> hand) {
        System.out.println("OverSevenTeen");
        return false;
    }
}
