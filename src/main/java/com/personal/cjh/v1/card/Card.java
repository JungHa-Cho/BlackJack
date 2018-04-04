/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v1.card;

import org.apache.commons.lang3.tuple.ImmutablePair;

/**
 * 카드 클래스
 * 카드 구현체 입니다.
 * 카드는 추상 개념이 아니라 실제 구현된 구현물체라서 클래스로 변경했습니다.
 */
public class Card {
    private Suit suit;
    private Denomination denomination;

    /**
     * 새로운 카드를 만들때 호출되는 생성자
     *
     * @param suit         한벌 중 한개의 모양
     * @param denomination 끗수
     */
    public Card(final Suit suit, final Denomination denomination) {
        this.suit = suit;
        this.denomination = denomination;
    }

    /**
     * 카드 인스턴스의 모양과 끗수를 리턴
     * 카드를 확인하는 행동을 check 메소드로 추상화
     *
     * @return 변경 불가능한 한쌍으로 리턴합니다.
     */
    public ImmutablePair<Suit, Denomination> check() {
        return new ImmutablePair<>(suit, denomination);
    }
}
