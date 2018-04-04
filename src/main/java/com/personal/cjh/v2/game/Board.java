/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.game;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import com.personal.cjh.v2.user.Dealer;
import com.personal.cjh.v2.user.Player;
import org.apache.commons.lang3.tuple.Pair;

public class Board {
    private Player player;
    private Dealer dealer;

    public Board(Player player, Dealer dealer) {
        this.player = player;
        this.dealer = dealer;
    }

    public void gameStart() {
        System.out.println("Dealer : Card를 섞습니다.");
        dealer.shuffleTheCard();

        System.out.println("Dealer : 2장씩 나누겠습니다.");
        for (int i = 0; i < 2; i++) {
            player.receiveCard(callHit());
            dealer.receiveCard(callHit());
        }
        printCmd();
    }

    private Pair<Suit, Denomination> callHit() {
        return dealer.drawCard();
    }

    private void printCmd() {
        System.out.println("Dealer : 가지고 있는 패를 보여주세요.");
        System.out.println("-----------------------------------");
        System.out.print("Dealer : ");
        dealer.showCard();
        System.out.print("Player : ");
        player.showCard();
        System.out.println("-----------------------------------");
        System.out.println("1. Hit");
        System.out.println("2. Stay");
    }
}
