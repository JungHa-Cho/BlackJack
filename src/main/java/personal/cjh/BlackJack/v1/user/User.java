/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package personal.cjh.BlackJack.v1.user;

import personal.cjh.BlackJack.v1.card.Card;
import personal.cjh.BlackJack.v1.card.Hand;
import personal.cjh.BlackJack.v1.rule.Rule;

import java.util.ArrayList;
import java.util.List;

/**
 * 유저 추상 클래스 정의
 */
public abstract class User implements Hand {
    public List<Card> hand;
    public String name;
    Rule rule;

    /**
     * Instantiates a new User.
     */
    User(Rule rule) {
        hand = new ArrayList<>();
        this.rule = rule;
    }

    /**
     * Gets rule.
     *
     * @return the rule
     */
    public Rule getRule() {
        return rule;
    }

    /**
     * 카드를 받는다.
     * 딜러는 덱으로부터, 플레이어는 딜러로부터
     */
    abstract public Card drawCard();
}
