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
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Card Unit Test.
 * 카드 유닛 테스트 클래스
 * Suit와 Denomination 1가지씩의 조합인 카드
 * 카드 클래스 생성을 위해 TDD로 작성한 테스트 함수들
 */
public class CardUnitTest {

    private Card getCard(Suit heart, Denomination denomination) {
        return new Card(heart, denomination);
    }

    /**
     * Suit 모양 기본 검사.
     */
    @Test
    public void SUIT_모양_기본_검사() {
        assertThat(getCard(HEART, null).isEqual(HEART), is(true));
        assertThat(getCard(SPADE, null).isEqual(SPADE), is(true));
        assertThat(getCard(CLOVER, null).isEqual(CLOVER), is(true));
        assertThat(getCard(DIAMOND, null).isEqual(DIAMOND), is(true));
    }

    /**
     * Suit 모양 속성 검사.
     */
    @Test
    public void SUIT_모양_속성_검사() {
        assertThat(HEART.toString(), is("HEART"));
        assertThat(SPADE.toString(), is("SPADE"));
        assertThat(DIAMOND.toString(), is("DIAMOND"));
        assertThat(CLOVER.toString(), is("CLOVER"));
    }

    /**
     * Denom 숫자 기본 검사.
     */
    @Test
    public void DENOM_숫자_기본_검사() {
        assertThat(getCard(null, ACE).isEqual(ACE), is(true));
        assertThat(getCard(null, TWO).isEqual(TWO), is(true));
        assertThat(getCard(null, THREE).isEqual(THREE), is(true));
        assertThat(getCard(null, FOUR).isEqual(FOUR), is(true));
        assertThat(getCard(null, FIVE).isEqual(FIVE), is(true));
        assertThat(getCard(null, SIX).isEqual(SIX), is(true));
        assertThat(getCard(null, SEVEN).isEqual(SEVEN), is(true));
        assertThat(getCard(null, EIGHT).isEqual(EIGHT), is(true));
        assertThat(getCard(null, NINE).isEqual(NINE), is(true));
        assertThat(getCard(null, TEN).isEqual(TEN), is(true));
        assertThat(getCard(null, KING).isEqual(KING), is(true));
        assertThat(getCard(null, QUEEN).isEqual(QUEEN), is(true));
        assertThat(getCard(null, JACK).isEqual(JACK), is(true));
    }

    /**
     * Deno 숫자 속성 검사.
     */
    @Test
    public void DENO_숫자_속성_검사() {
        assertThat(ACE.getProperty(), is(1));
        assertThat(TWO.getProperty(), is(2));
        assertThat(THREE.getProperty(), is(3));
        assertThat(FOUR.getProperty(), is(4));
        assertThat(FIVE.getProperty(), is(5));
        assertThat(SIX.getProperty(), is(6));
        assertThat(SEVEN.getProperty(), is(7));
        assertThat(EIGHT.getProperty(), is(8));
        assertThat(NINE.getProperty(), is(9));
        assertThat(TEN.getProperty(), is(10));
        assertThat(KING.getProperty(), is(10));
        assertThat(QUEEN.getProperty(), is(10));
        assertThat(JACK.getProperty(), is(10));
    }
}
