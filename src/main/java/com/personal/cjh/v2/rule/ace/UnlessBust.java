/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.rule.ace;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * 딜러 룰
 * 버스트가 아니면 무조건 11로 계산
 */
public class UnlessBust implements Ace {
    @Override
    public boolean isEleven(List<Pair<Suit, Denomination>> hand) {
        return true;
    }
}
