/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.card;

import com.personal.cjh.v3.expt.EmptyHandException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 핸드 클래스.
 * 간단히 리스트로, 딜러와 플레이어에 인스턴스 변수로 생성할수 있었지만,
 * 개념 분리, 핸드는 손에 있는 카드들 이라는 개념으로,
 * 카드를 받고, 핸드에 넣고, 단순 카드의 합을 리턴함.
 */
public class Hand {
    private List<Card> hand;

    /**
     * 핸드는 생성시점에 이미 풀;fool 이 정해져 있음.
     * 리스트 주입 대신, 생성.
     */
    public Hand() {
        hand = new ArrayList<>();
    }

    public List<Card> getHand() {
        return hand;
    }

    /**
     * Receive.
     *
     * @param card the card
     */
    public void receive(Card card) {
        hand.add(card);
    }

    /**
     * 단순 카드를 카운트해 리턴한다.
     *
     * ACE 카드 계산법이 이중이라 이부분을 고민해봐야 할듯.
     *
     * @return the int
     * @throws EmptyHandException the empty hand exception
     */
    public int count() throws EmptyHandException {
        if (hand.size() == 0)
            throw new EmptyHandException("핸드가 비어있습니다.");
        Iterator<Card> cardIterator = hand.iterator();
        int count = 0;
        while (cardIterator.hasNext())
            count += cardIterator.next().count();
        return count;
    }
}
