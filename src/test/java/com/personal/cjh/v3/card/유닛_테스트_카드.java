/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.card;

import org.junit.Test;

import static com.personal.cjh.v3.card.Denomination.*;
import static com.personal.cjh.v3.card.Suit.*;
import static org.junit.Assert.assertTrue;

/**
 * Card Unit Test.
 * 카드 유닛 테스트 클래스, Suit와 Denomination 1가지씩의 조합인 카드
 * 카드 클래스 생성을 위해 TDD로 작성한 테스트 함수들
 *
 * isEqualUsingSuit 함수를 증명하면서, enum 객체의 유효성을 같이 검사함.
 */
public class 유닛_테스트_카드 {

    private boolean isEqualUsingSuit(Suit suit, Suit suit1) {
        return new Card(suit, null).isEqualUsingSuit(suit1);
    }

    private boolean isEqualUsingDenom(Denomination denom, Denomination denom1) {
        return new Card(null, denom).isEqualUsingDenom(denom1);
    }

    private boolean isEqualUsingString(String heart, String actual) {
        return actual.equals(heart);
    }

    private boolean isEqualUsingInteger(int realInteger, int denomToInt) {
        return denomToInt == realInteger;
    }

    private boolean isEqualUsingCard(Suit heart, Denomination ace, Suit heart1, Denomination ace1) {
        return new Card(heart, ace).isEqualUsingCard(new Card(heart1, ace1));
    }

    @Test
    public void CARD_비교_메소드_이용한_비교() {
        assertTrue(isEqualUsingCard(Suit.HEART, Denomination.ACE, Suit.HEART, Denomination.ACE));
        assertTrue(isEqualUsingCard(Suit.DIAMOND, Denomination.KING, Suit.DIAMOND, Denomination.KING));
        assertTrue(isEqualUsingCard(Suit.SPADE, Denomination.QUEEN, Suit.SPADE, Denomination.QUEEN));
        assertTrue(isEqualUsingCard(Suit.CLOVER, Denomination.JACK, Suit.CLOVER, Denomination.JACK));
    }

    /**
     * Suit 모양 기본 검사.
     */
    @Test
    public void SUIT_객체_비교_검사() {
        assertTrue(isEqualUsingSuit(HEART, HEART));
        assertTrue(isEqualUsingSuit(SPADE, SPADE));
        assertTrue(isEqualUsingSuit(CLOVER, CLOVER));
        assertTrue(isEqualUsingSuit(DIAMOND, DIAMOND));
    }

    /**
     * Suit 모양 속성 검사.
     */
    @Test
    public void SUIT_속성_비교_검사() {
        assertTrue(isEqualUsingString("HEART", HEART.toString()));
        assertTrue(isEqualUsingString("SPADE", SPADE.toString()));
        assertTrue(isEqualUsingString("DIAMOND", DIAMOND.toString()));
        assertTrue(isEqualUsingString("CLOVER", CLOVER.toString()));
    }

    /**
     * Denom 숫자 기본 검사.
     */
    @Test
    public void DENOM_객체_비교_검사() {
        assertTrue(isEqualUsingDenom(ACE, ACE));
        assertTrue(isEqualUsingDenom(TWO, TWO));
        assertTrue(isEqualUsingDenom(THREE, THREE));
        assertTrue(isEqualUsingDenom(FOUR, FOUR));
        assertTrue(isEqualUsingDenom(FIVE, FIVE));
        assertTrue(isEqualUsingDenom(SIX, SIX));
        assertTrue(isEqualUsingDenom(SEVEN, SEVEN));
        assertTrue(isEqualUsingDenom(EIGHT, EIGHT));
        assertTrue(isEqualUsingDenom(NINE, NINE));
        assertTrue(isEqualUsingDenom(TEN, TEN));
        assertTrue(isEqualUsingDenom(KING, KING));
        assertTrue(isEqualUsingDenom(QUEEN, QUEEN));
        assertTrue(isEqualUsingDenom(JACK, JACK));
    }

    /**
     * Deno 숫자 속성 검사.
     */
    @Test
    public void DENOM_속성_비교_검사() {
        assertTrue(isEqualUsingInteger(1, ACE.getProperty()));
        assertTrue(isEqualUsingInteger(2, TWO.getProperty()));
        assertTrue(isEqualUsingInteger(3, THREE.getProperty()));
        assertTrue(isEqualUsingInteger(4, FOUR.getProperty()));
        assertTrue(isEqualUsingInteger(5, FIVE.getProperty()));
        assertTrue(isEqualUsingInteger(6, SIX.getProperty()));
        assertTrue(isEqualUsingInteger(7, SEVEN.getProperty()));
        assertTrue(isEqualUsingInteger(8, EIGHT.getProperty()));
        assertTrue(isEqualUsingInteger(9, NINE.getProperty()));
        assertTrue(isEqualUsingInteger(10, TEN.getProperty()));
        assertTrue(isEqualUsingInteger(10, KING.getProperty()));
        assertTrue(isEqualUsingInteger(10, QUEEN.getProperty()));
        assertTrue(isEqualUsingInteger(10, JACK.getProperty()));
    }
}
