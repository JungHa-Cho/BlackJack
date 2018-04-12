/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.card;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author cho_jeong_ha
 * @project BlackJack
 * @update 2018-04-12
 **/
public class 유닛_테스트_핸드 {

    @Test
    public void canCreate() {
        Hand hand = new Hand();
    }

    @Test
    public void canReceived() {
        Hand hand = new Hand();
        hand.receive(new Card(Suit.SPADE, Denomination.JACK));
        assertTrue(hand.count() > 0);
    }

    @Test
    public void canCount() {
        Hand hand = new Hand();
        hand.receive(new Card(Suit.SPADE, Denomination.JACK));
        hand.receive(new Card(Suit.HEART, Denomination.ACE));
        hand.receive(new Card(Suit.DIAMOND, Denomination.THREE));
        hand.receive(new Card(Suit.CLOVER, Denomination.FIVE));
        hand.receive(new Card(Suit.HEART, Denomination.SEVEN));
        assertTrue(hand.count() == 26);
    }
}
