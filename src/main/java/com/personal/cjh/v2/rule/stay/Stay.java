/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.rule.stay;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * Stay Rule.
 */
public interface Stay {
    /**
     * Stay 룰에 부합하는지.
     *
     * @param hand the hand
     * @return the boolean
     */
    boolean isStay(List<Pair<Suit, Denomination>> hand);
}
