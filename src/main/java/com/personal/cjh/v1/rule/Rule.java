/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v1.rule;

import com.personal.cjh.v1.card.Card;

import java.util.List;

/**
 * 룰 인터페이스
 * 딜러와 유저 모두 적용 받는다.
 */
public interface Rule {
    /**
     * 룰 체크 ( 딜러와 플레이어가 둘다 유저임으로 둘다 룰 체크 가능 )
     * 딜러와 플레이어의 핸드가 필요하다.
     *
     * @return rule 인터페이스 구현 예정
     */
    boolean isBlackJack(List<Card> cardList); // 처음 2장의 카드 합이 21이면 블랙잭
    boolean isBust(List<Card> cardList);      // 카드의 합이 21을 초과하면 Bust
}
