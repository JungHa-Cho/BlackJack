/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package personal.cjh.BlackJack.v1.user;

import personal.cjh.BlackJack.v1.card.Card;
import personal.cjh.BlackJack.v1.card.Deck;
import personal.cjh.BlackJack.v1.rule.DealerRule;

import java.util.ArrayList;
import java.util.List;

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
        super(new DealerRule());
        this.name = name;
        dealerDeck = new Deck();
    }

    @Override
    public Card drawCard() {
        return dealerDeck.drawDeck();
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
