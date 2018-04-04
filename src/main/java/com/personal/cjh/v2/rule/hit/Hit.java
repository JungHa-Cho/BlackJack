/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.rule.hit;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * Hit 룰을 구현함
 */
public interface Hit {
    /**
     * Hit 할지 말지를 구현.
     * 딜러 전용
     *
     * @param hand 딜러의 핸드
     * @return Hit 룰은 17 Uder 일때 무조건 Hit
     */
    boolean isHit(List<Pair<Suit, Denomination>> hand);
}
