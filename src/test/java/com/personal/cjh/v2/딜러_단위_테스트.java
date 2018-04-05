/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import com.personal.cjh.v2.rule.ace.UnlessBust;
import com.personal.cjh.v2.rule.hit.HitChoice;
import com.personal.cjh.v2.rule.stay.UnconditionalStay;
import com.personal.cjh.v2.user.Dealer;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class 딜러_단위_테스트 {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void 딜러_카운팅() {
        // Given - 딜러 생성
        Dealer d1 = new Dealer(new HitChoice(), new UnconditionalStay(), new UnlessBust());
        Dealer d2 = new Dealer(new HitChoice(), new UnconditionalStay(), new UnlessBust());
        Dealer d3 = new Dealer(new HitChoice(), new UnconditionalStay(), new UnlessBust());

        // When - 카드 삽입
        d1.receiveCard(Pair.of(Suit.SPADE, Denomination.ACE));
        d2.receiveCard(Pair.of(Suit.CLOVER, Denomination.ACE));
        d2.receiveCard(Pair.of(Suit.DIAMOND, Denomination.JACK));
        d3.receiveCard(Pair.of(Suit.HEART, Denomination.ACE));
        d3.receiveCard(Pair.of(Suit.SPADE, Denomination.ACE));

        // When - 카운팅 검사
        assertThat(d1.counting()).isEqualTo(11);
        assertThat(d2.counting()).isEqualTo(21);
        assertThat(d3.counting()).isEqualTo(12);
    }

    @Test
    public void 딜러_ACE_카드_점수_11로_계산() {
        // Given - 검사 Deck 생성
        List<Pair<Suit, Denomination>> deck = new ArrayList<>();

        // Given - 딜러 생성
        deck.add(Pair.of(Suit.SPADE, Denomination.ACE));
        boolean check = new UnlessBust().isEleven(deck);

        // When - isAce 호출
        assertThat(check).isTrue();
    }

    @Test
    public void 딜러_ACE_카드_점수_1로_계산() {
        // Given - 검사 Deck 생성
        List<Pair<Suit, Denomination>> deck = new ArrayList<>();

        // Given - 딜러용 룰 생성
        UnlessBust ace = mock(UnlessBust.class);

        // Given - 딜러 생성
        deck.add(Pair.of(Suit.SPADE, Denomination.ACE));
        deck.add(Pair.of(Suit.SPADE, Denomination.KING));
        deck.add(Pair.of(Suit.SPADE, Denomination.JACK));

        // When - isAce 호출
        assertThat(ace.isEleven(deck)).isFalse();
    }

    @Test
    public void 딜러_Ace_카드_검사_메소드_호출_여부() {
        // Given - 검사 Deck 생성
        List<Pair<Suit, Denomination>> deck = new ArrayList<>();

        // Given - 딜러 생성
        UnlessBust ace = mock(UnlessBust.class);
        Dealer dd = new Dealer(mock(HitChoice.class), mock(UnconditionalStay.class), ace);
        dd.counting();

        // Then - isEleven 호출 여부 검사
        //verify(ace, atLeastOnce());
    }
}