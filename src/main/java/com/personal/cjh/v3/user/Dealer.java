/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.user;

import com.personal.cjh.v3.card.Card;
import com.personal.cjh.v3.card.Deck;
import com.personal.cjh.v3.card.Hand;

/**
 * 딜러.
 * <p>
 * 딜러는 게임을 직접 플레이 하지 않고 룰에 따라 플레이함,
 * 하지만, 카드를 나눠주는 행동 자체는 딜러가 수행하며,
 * 덱 또한 직접 컨트롤 하지 않지만, 나눠 줌,
 * <p>
 * 딜러와, 플레이어는 카운팅을 함.
 * 카드 숫자를 보고 단순 계산이 아니라 예측을 함.
 * 이를 카운팅이라 하고, 단순 카운트는 핸드 클래스에서 수행.
 * <p>
 * 후에 카운팅 메소드에서 게임 룰을 적용시킬 예정.
 */
public class Dealer implements User {
    private Hand hand;
    private Deck deck;

    /**
     * 딜러 생성자.
     * 게임과 상호작용을 위해 게임의 덱을 주입 받음.
     *
     * @param hand the hand
     * @param deck the deck
     */
    public Dealer(Hand hand, Deck deck) {
        this.hand = hand;
        this.deck = deck;
    }

    /**
     * Shuffle.
     */
    public void shuffle() {
        deck.shuffle();
    }

    public void hit() {
        hand.receive(deck.drawCard());
    }

    public void stay() {
        // Not To Do
    }

    @Override
    public int counting() {
        return hand.count();
    }

    /**
     * 게임 객체에서 카드를 뽑음.
     *
     * @return the card
     */
    public Card draw() {
        return deck.drawCard();
    }
}
