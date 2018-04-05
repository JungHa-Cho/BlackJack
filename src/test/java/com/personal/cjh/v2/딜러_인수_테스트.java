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
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class 딜러_인수_테스트 {
    @Test
    public void 딜러_카드_섞기_중복_검사() {
        // Given - 중복검사용 리스트
        List<Pair<Suit, Denomination>> list = new ArrayList<>();

        // Given - 딜러용 룰 생성
        UnlessBust ace = mock(UnlessBust.class);
        HitChoice hit = mock(HitChoice.class);
        UnconditionalStay stay = mock(UnconditionalStay.class);

        // Given - 딜러 생성
        Dealer mock = new Dealer(hit, stay, ace);

        // When - isAce 호출
        mock.shuffleTheCard();

        // Then - 카드 중복 검사
        for (int i = 0; i < 52; i++) {
            Pair<Suit, Denomination> card = mock.drawCard();
            for (Pair<Suit, Denomination> listCard : list) {
                if (card.getLeft() == listCard.getLeft()) {
                    if (card.getRight() == listCard.getRight()) {
                        throw new RuntimeException("덱, 카드 중복 발생");
                    }
                }
            }
            list.add(card);
        }

        // Then - 카드 52장 검사
        assertThat(list.size()).isEqualTo(52);
    }

    @Test
    public void 딜러_카드_섞기_메소드_호출_검사() {
        // Given - 딜러용 룰 생성
        UnlessBust ace = mock(UnlessBust.class);
        HitChoice hit = mock(HitChoice.class);
        UnconditionalStay stay = mock(UnconditionalStay.class);

        // Given - 딜러 생성
        Dealer mock = mock(Dealer.class);

        // When - 카드 섞기 호출
        mock.shuffleTheCard();

        // Then - 카드 섞기 호출 여부 검사
        verify(mock).shuffleTheCard();
    }
}
