/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.user;

import com.personal.cjh.v3.card.Card;
import com.personal.cjh.v3.card.Hand;

/**
 * 플레이어는 히트와 스테이를 외친다.
 * 카운팅을 할 수 있다.
 */
public class Player implements User {
    private Hand hand;

    /**
     * 플레이어 생성자.
     *
     * @param hand the hand
     */
    public Player(Hand hand) {
        this.hand = hand;
    }

    public void hit(Card card) {
        hand.receive(card);
    }

    public void stay() {
        // Not To Do
    }

    @Override
    public int counting() {
        return hand.count();
    }
}
