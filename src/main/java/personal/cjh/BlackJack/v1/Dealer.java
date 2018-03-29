/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package personal.cjh.BlackJack.v1;

import personal.cjh.BlackJack.v1.rule.DealerRule;

/**
 * 딜러 클래스
 * 딜러 또한 유저이고, 룰을 적용 받는다.
 */
public class Dealer extends User {
    private Deck dealerDeck;
    /**
     * 딜러는 핸드와 덱을 가진다.
     * 딜러의 룰을 적용 받는다.
     */
    public Dealer(String name) {
        super();
        this.name = name;
        dealerDeck = new Deck();
        rule = new DealerRule();
    }

    @Override
    Card drawCard() {
        return dealerDeck.getCard();
    }
}
