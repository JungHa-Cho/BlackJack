/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3;

import com.personal.cjh.v3.card.Deck;
import com.personal.cjh.v3.user.Dealer;
import com.personal.cjh.v3.user.Player;

public class Game {
    private Deck deck;

    public Game(Deck deck) {
        this.deck = deck;
    }

    public void start() {
    }

    public void initializeGame(Dealer dealer, Player ...players) {
        Dealer gameDealer = dealer;
        Player gamePlayer = null;
        for (Player player : players)
            gamePlayer = player;

        System.out.println("딜러는 우선 카드를 섞습니다.");
        gameDealer.shuffle();

        System.out.println("딜러는 플레이어에게 각각 2장씩 나눠줍니다.");
        System.out.println("물논 자기 자신도요.");

        for (int i = 0; i < 2; i++) {
            gamePlayer.hit(gameDealer.draw());
            gameDealer.hit();
        }
    }
}
