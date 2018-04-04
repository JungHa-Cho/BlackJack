/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v1.card;

/**
 * 각 유저가 들고 있는 핸드, 카드의 집합
 */
public interface Hand {
    /**
     * 드로우 카드 했을때,
     * 호출해서 핸드에 넣어야 하는 셋 메소드
     *
     * @param received the received
     */
    void receiveCard(Card received);

    /**
     * 가지고 있는 카드를 모두 보여줌
     */
    void showCards();
}
