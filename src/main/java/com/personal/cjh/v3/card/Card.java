/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.card;

import javafx.util.Pair;

/**
 * 카드 클래스.
 * <p>
 * 원칙1. 메소드당 들여쓰기 한번
 * - 이퀄 메소드를 잘게 분리시킴
 * 원칙7. 클래스의 인스턴스 변수는 1개로 제한한다.
 * - 카드는 모양과 끗수를 가져야 온전한 카드이므로, Pair를 이용
 */
public class Card {
    private Pair<Suit, Denomination> card;

    /**
     * 생성자, 모양과 끗수를 받아 카드 객체의 속성을 생성.
     *
     * @param suit         the suit
     * @param denomination the denomination
     */
    public Card(Suit suit, Denomination denomination) {
        card = new Pair<>(suit, denomination);
    }

    /**
     * Card의 모양과 끗수를 둘다 비교.
     *
     * @param val the val
     * @return the boolean
     */
    public boolean isEqualUsingCard(Card val) {
        return isEqualUsingSuit(val.card.getKey()) && isEqualUsingDenom(val.card.getValue());
    }

    /**
     * Card의 끗수만 비교.
     *
     * @param denomination the denomination
     * @return the boolean
     */
    public boolean isEqualUsingDenom(Denomination denomination) {
        return denomination == card.getValue();
    }

    /**
     * Card의 모양만 비교.
     *
     * @param suit the suit
     * @return the boolean
     */
    public boolean isEqualUsingSuit(Suit suit) {
        return suit == card.getKey();
    }

    @Override
    public String toString() {
        return "[" +
                card.getKey().toString() +
                ", " +
                card.getValue() +
                "]";
    }
}
