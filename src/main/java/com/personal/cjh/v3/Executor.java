/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3;

import com.personal.cjh.v3.card.Deck;
import com.personal.cjh.v3.card.Hand;
import com.personal.cjh.v3.user.Dealer;
import com.personal.cjh.v3.user.Player;

/**
 * @author cho_jeong_ha
 * @project BlackJack
 * @update 2018-05-09
 **/
public class Executor {
    public static void main(String[] args) {
        Deck deck = new Deck();

        Hand dealerHand = new Hand();
        Dealer dealer = new Dealer(dealerHand, deck);

        Hand jackSparrowHand = new Hand();
        Player jackSparrow = new Player(jackSparrowHand);

        Hand simonHand = new Hand();
        Player simon = new Player(simonHand);

        Game game = new Game(dealer, simon, jackSparrow);

        /* 검증을 어떻게 해야하나? */
        game.start();
    }
}
