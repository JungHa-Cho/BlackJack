/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3;

import com.personal.cjh.v3.card.Card;
import com.personal.cjh.v3.card.Denomination;
import com.personal.cjh.v3.card.Suit;
import org.junit.Test;

import static com.personal.cjh.v3.card.Denomination.*;
import static com.personal.cjh.v3.card.Suit.*;
import static org.junit.Assert.assertTrue;

/**
 * Card Unit Test.
 * 카드 유닛 테스트 클래스
 * Suit와 Denomination 1가지씩의 조합인 카드
 * 카드 클래스 생성을 위해 TDD로 작성한 테스트 함수들
 */
public class CardUnitTest {

    private boolean isEqual(Suit suit, Suit suit1) {
        return new Card(suit, null).isEqual(suit1);
    }

    private boolean isEqual(Denomination denom, Denomination denom1) {
        return new Card(null, denom).isEqual(denom1);
    }

    private boolean isEqual(String heart, String actual) {
        return actual.equals(heart);
    }

    private boolean isEqual(int actual1, int actual) {
        return actual == actual1;
    }

    /**
     * Suit 모양 기본 검사.
     */
    @Test
    public void SUIT_객체_비교_검사() {
        assertTrue(isEqual(HEART, HEART));
        assertTrue(isEqual(SPADE, SPADE));
        assertTrue(isEqual(CLOVER, CLOVER));
        assertTrue(isEqual(DIAMOND, DIAMOND));
    }

    /**
     * Suit 모양 속성 검사.
     */
    @Test
    public void SUIT_속성_비교_검사() {
        assertTrue(isEqual("HEART", HEART.toString()));
        assertTrue(isEqual("SPADE", SPADE.toString()));
        assertTrue(isEqual("DIAMOND", DIAMOND.toString()));
        assertTrue(isEqual("CLOVER", CLOVER.toString()));
    }

    /**
     * Denom 숫자 기본 검사.
     */
    @Test
    public void DENOM_객체_비교_검사() {
        assertTrue(isEqual(ACE, ACE));
        assertTrue(isEqual(TWO, TWO));
        assertTrue(isEqual(THREE, THREE));
        assertTrue(isEqual(FOUR, FOUR));
        assertTrue(isEqual(FIVE, FIVE));
        assertTrue(isEqual(SIX, SIX));
        assertTrue(isEqual(SEVEN, SEVEN));
        assertTrue(isEqual(EIGHT, EIGHT));
        assertTrue(isEqual(NINE, NINE));
        assertTrue(isEqual(TEN, TEN));
        assertTrue(isEqual(KING, KING));
        assertTrue(isEqual(QUEEN, QUEEN));
        assertTrue(isEqual(JACK, JACK));
    }

    /**
     * Deno 숫자 속성 검사.
     */
    @Test
    public void DENOM_속성_비교_검사() {
        assertTrue(isEqual(1, ACE.getProperty()));
        assertTrue(isEqual(2, TWO.getProperty()));
        assertTrue(isEqual(3, THREE.getProperty()));
        assertTrue(isEqual(4, FOUR.getProperty()));
        assertTrue(isEqual(5, FIVE.getProperty()));
        assertTrue(isEqual(6, SIX.getProperty()));
        assertTrue(isEqual(7, SEVEN.getProperty()));
        assertTrue(isEqual(8, EIGHT.getProperty()));
        assertTrue(isEqual(9, NINE.getProperty()));
        assertTrue(isEqual(10, TEN.getProperty()));
        assertTrue(isEqual(10, KING.getProperty()));
        assertTrue(isEqual(10, QUEEN.getProperty()));
        assertTrue(isEqual(10, JACK.getProperty()));
    }
}
