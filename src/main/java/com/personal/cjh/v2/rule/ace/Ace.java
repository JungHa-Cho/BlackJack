/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.rule.ace;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * Ace 카드 룰을 구현
 */
public interface Ace {
    /**
     * Ace카드가 11로 카운팅 될지 검사.
     *
     * @param hand 체크할 핸드를 받음
     * @return True is 11 and False is 1
     */
    boolean isEleven(List<Pair<Suit, Denomination>> hand);
}
