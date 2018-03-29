/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package personal.cjh.BlackJack.v1;

import personal.cjh.BlackJack.v1.rule.Rule;

import java.util.ListIterator;

/**
 * 유저 추상 클래스 정의
 */
public abstract class User extends Hand {
    String name;
    Rule rule;

    /**
     * 핸드 초기화
     */
    User() {
        super();
    }

    /**
     * STRATEGY 패턴.
     * 동작중에 Rule을 변경 할 수 있게 해준다.
     * 필요 없으나, 패턴 연습겸 적용
     *
     * @param rule
     */
    void setRule(Rule rule) {
        this.rule = rule;
    }

    /**
     * 카드를 받는다.
     * 딜러는 덱으로부터, 플레이어는 딜러로부터
     */
    abstract Card drawCard();

    /**
     * 가지고 있는 카드를 모두 보여줌
     */
    void showCards() {
        ListIterator<Card> is = hand.listIterator();
        while (is.hasNext()) {
            Card card = is.next();
            System.out.print(" [" + card.check().left + ", " + card.check().right + "] ");
        }
    }
}
