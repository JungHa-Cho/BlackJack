/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.card;

import com.personal.cjh.v3.expt.EmptyDeckException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 덱 클래스.
 * 게임 한판당 덱은 한가지만 존재 해야 함.
 * 싱글톤으로 Double Locking Checking 실습 해봄.
 * 덱 클래스에 위반 항목이 많음.. 리팩토링 대상.
 * <p>
 * 원칙7. 한 클래스에는 하나의 인스턴스 변수만 가진다.
 * <p>
 * 2018-04-10 싱글톤 폐쇄. 궂이 덱을 싱글톤으로 생성할 이유가 없음.
 */
public class Deck {
    private List<Card> cards;

    /**
     * Instantiates a new Deck.
     */
    public Deck() {
    }

    /**
     * 덱 초기화.
     * 모양 4가지, 끗수 13가지 = 52장
     */
    public void shuffle() {
        if (cards == null) {
            cards = new ArrayList<>();
            initialize();
        }
    }

    private void initialize() {
        for (int i = 0; i < Suit.values().length; i++) {
            for (int j = 0; j < Denomination.values().length; j++) {
                cards.add(new Card(Suit.values()[i], Denomination.values()[j]));
            }
        }
    }

    /**
     * 카드 뽑기.
     *
     * @return the card
     * @throws EmptyDeckException the empty deck exception
     */
    public Card drawCard() throws EmptyDeckException {
        if (cards.size() == 0)
            throw new EmptyDeckException("뽑을 수 있는 카드가 없습니다.");
        return draw();
    }

    private Card draw() {
        Random random = new Random();
        int index = random.nextInt(cards.size());
        Card val = cards.get(index);
        cards.remove(index);
        return val;
    }
}
