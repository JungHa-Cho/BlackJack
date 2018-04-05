/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.game;

import com.personal.cjh.v2.card.Denomination;
import com.personal.cjh.v2.card.Suit;
import com.personal.cjh.v2.user.Dealer;
import com.personal.cjh.v2.user.Player;
import org.apache.commons.lang3.tuple.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

        while (true) {
            int input;
            if ((input = printCmd()) == 1) {
                player.receiveCard(callHit());
                dealer.isHit();
            } else if (input == 2) {
                dealer.isHit();
            } else {

            }

            int pSum = player.counting();
            int dSum = dealer.counting();
            if (pSum > 21 && dSum > 21) {
                System.out.println("둘다 BUST!");
                System.exit(-1);
            } else if (pSum > 21) {
                System.out.println("Player Bust");
                System.exit(-1);
            } else if (dSum > 21) {
                System.out.println("Dealer Bust");
                System.exit(-1);
            } else if (pSum == 21 && dSum == 21) {
                System.out.println("비겼습니다!");
                System.exit(-1);
            } else if (pSum == 21) {
                System.out.println(" PLAYER 블랙잭!");
                System.exit(-1);
            } else if (dSum == 21) {
                System.out.println(" DEALER 블랙잭!");
                System.exit(-1);
            }
        }
    }

    private Pair<Suit, Denomination> callHit() {
        return dealer.drawCard();
    }

    private int printCmd() {
        System.out.println("Dealer : 가지고 있는 패를 보여주세요.");
        System.out.println("-----------------------------------");
        System.out.print("Dealer : [" + dealer.counting() + "] ");
        dealer.showCard();
        System.out.print("Player : [" + player.counting() + "] ");
        player.showCard();
        System.out.println("-----------------------------------");
        System.out.println("1. Hit");
        System.out.println("2. Stay");
        return getUserInput();
    }

    private int getUserInput() {
        String answer = null;

        System.out.println("숫자만 입력 하세요.");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO 오류");
        }

        if (answer == null) {
            return 0;
        }

        return Integer.parseInt(answer);
    }
}
