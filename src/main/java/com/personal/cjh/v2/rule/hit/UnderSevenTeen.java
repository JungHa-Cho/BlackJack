/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.rule.hit;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * 딜러 룰
 * 17 이하 무조건 히트
 */
public class UnderSevenTeen implements Hit {
    @Override
    public boolean isHit(List<Pair<Suit, Denomination>> hand) {
        System.out.println("UnderSevenTeen");
        return false;
    }
}
