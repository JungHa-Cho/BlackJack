/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v1.user;

import com.personal.cjh.v1.card.Card;
import com.personal.cjh.v1.rule.PlayerRule;

/**
 * 플레이어 클래스
 */
public class Player extends User {
    /**
     * 플레이어는 핸드를 가진다.
     * 플레이어의 룰을 적용받는다.
     */
    public Player(String name) {
        super(new PlayerRule());
        this.name = name;
    }

    @Override
    public Card drawCard() {
        // drawCard 카드를 요청함
        return null;
    }

    @Override
    public void receiveCard(Card received) {
        hand.add(received);
    }

    @Override
    public void showCards() {
        for (Card card : hand) {
            System.out.print(" [" + card.check().left + ", " + card.check().right + "] ");
        }
    }
}
