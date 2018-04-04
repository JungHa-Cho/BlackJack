/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.rule.hit;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * 플레이어 Hit 룰.
 * 플레이어는 선택한다.
 */
public class HitChoice implements Hit {
    @Override
    public boolean isHit(List<Pair<Suit, Denomination>> hand) {
        /* 무조건 실패, 유저는 Hit를 선택한다 */
        return false;
    }
}
