/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v1.rule;

import com.personal.cjh.v1.card.Card;

import java.util.List;

/**
 * Player Rule
 */
public class PlayerRule implements Rule {
    @Override
    public boolean isBlackJack(List<Card> cardList) {
        // JAVA 1.8 STREAM API
        // list 숫자를 순회 돌면서 더한뒤 21이면 참
        return cardList.stream()
                .mapToInt(card -> card.check().right.getProperty())
                .sum() == 21;
    }

    @Override
    public boolean isBust(List<Card> cardList) {
        return cardList.stream()
                .mapToInt(card -> card.check().right.getProperty())
                .sum() > 21;
    }
}
