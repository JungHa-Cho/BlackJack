/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3;

import com.personal.cjh.v3.card.Card;
import com.personal.cjh.v3.user.Dealer;
import com.personal.cjh.v3.user.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Game의 역할.
 * - 딜러나 플레이어가 질때까지 게임을 진행시킴.
 * - 딜러나 플레이어가 졌는지 검사를 해야함.
 *
 * Game의 책임.
 * - 역할에 따라 책임은 따라온다.
 * - Start 메소드는 게임을 시작하는 책임과 이긴자를 통보하는 책임을 진다.
 * - Game을 생성한 Main 클래스에게 누가 이겼는지 통보 한다.
 */
public class Game {
    private Dealer dealer;
    private List<Player> gamePlayers;

    /**
     * 게임에는 딜러와 플레이어, 유저가 필요하다.
     *
     * @param dealer  the dealer
     * @param players the players
     */
    Game(final Dealer dealer, final Player ...players) {
        gamePlayers = new ArrayList<>(Arrays.asList(players));
        this.dealer = dealer;
    }

    /**
     * 외부 객체에게 제공하는 공용 인터페이스.
     * 게임을 실행시키는 메소드만 외부에 오픈한다.
     */
    public void start() {
        initializeGame();
        printHand();
    }

    private void printHand() {
        int cnt = 0;
        for (Player player : gamePlayers) {
            cnt++;
            String stringCard = "";
            for (Card card : player.getHand().getHand()) {
                stringCard = stringCard + card.toString();
            }
            System.out.println(String.format("Player%s, Sum:%s, Card:%s", cnt, player.counting(), stringCard));
        }

        String stringCard = "";
        for (Card card : dealer.getHand().getHand()) {
            stringCard = stringCard + card.toString();
        }
        System.out.println(String.format("dealer, Sum:%s, Card:%s", dealer.counting(), stringCard));
    }

    private void initializeGame() {
        System.out.println("딜러는 카드를 섞습니다.");
        dealer.shuffle();

        System.out.println("딜러는 플레이어에게 각각 2장씩 나눠줍니다.");
        initializeAllUserHand();
    }

    private void initializeAllUserHand() {
        for (int i = 0; i < 2; i++) {
            allPlayerDraw();
            dealer.hit();
        }
    }

    private void allPlayerDraw() {
        for (Player player : gamePlayers) {
            player.hit(dealer.draw());
        }
    }
}
