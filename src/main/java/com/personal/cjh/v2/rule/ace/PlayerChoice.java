/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.rule.ace;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * Player 룰
 * Ace 계산은 플레이어의 선택
 */
public class PlayerChoice implements Ace {
    @Override
    public boolean isEleven(List<Pair<Suit, Denomination>> hand) {
        /* 플레이어 초이스는 무조건 true */
        return true;
    }
}
