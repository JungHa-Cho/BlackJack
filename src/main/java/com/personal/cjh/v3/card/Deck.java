/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.card;

import com.personal.cjh.v3.expt.EmptyDeckException;

import java.util.ArrayList;
import java.util.List;

/**
 * 덱 클래스.
 * 게임 한판당 덱은 한가지만 존재 해야 함.
 * 싱글톤으로 Double Locking Checking 실습 해봄.
 * 덱 클래스에 위반 항목이 많음.. 리팩토링 대상.
 *
 * 원칙7. 한 클래스에는 하나의 인스턴스 변수만 가진다.
 *
 * 2018-04-10 싱글톤 폐쇄. 궂이 덱을 싱글톤으로 생성할 이유가 없음.
 */
public class Deck {
//    private volatile static Deck deck;
    private final List<Card> cards;
    private final Shuffle shuffler;

    public Deck() {
        shuffler = new Shuffle();
        cards = new ArrayList<>();
        initializeDeck();
    }

    /**
     * 덱 초기화.
     * 모양 4가지, 끗수 13가지 = 52장
     */
    private void initializeDeck() {
        for (int i = 0; i < Suit.values().length; i++) {
            for (int j = 0; j < Denomination.values().length; j++) {
                cards.add(new Card(Suit.values()[i], Denomination.values()[j]));
            }
        }
    }

    /**
     * 싱글톤.
     * DCL 적용
     *
     * @return the instance
     */
//    public static Deck getInstance() {
//        if (deck == null) {
//            synchronized (Deck.class) {
//                if (deck == null) {
//                    deck = new Deck();
//                }
//            }
//        }
//        return deck;
//    }


    /**
     * 카드 뽑기.
     *
     * @return the card
     * @throws EmptyDeckException the empty deck exception
     */
    public Card drawCard() throws EmptyDeckException {
        if (cards.size() == 0)
            throw new EmptyDeckException("뽑을 수 있는 카드가 없습니다.");
        return shuffle();
    }

    private Card shuffle() {
        int index = shuffler.getRandom(cards.size());
        Card card = cards.get(index);
        cards.remove(index);
        return card;
    }
}
