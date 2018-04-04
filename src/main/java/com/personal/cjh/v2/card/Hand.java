/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.card;

import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * 각 유저가 들고 있는 핸드, 카드의 집합
 */
public abstract class Hand {
    protected List<Pair<Suit, Denomination>> hand;
    protected abstract void receiveCard(Pair<Suit, Denomination> card);
}
