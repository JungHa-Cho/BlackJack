/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package personal.cjh.BlackJack.v1;

import personal.cjh.BlackJack.v1.game.Board;
import personal.cjh.BlackJack.v1.rule.DealerRule;
import personal.cjh.BlackJack.v1.rule.PlayerRule;
import personal.cjh.BlackJack.v1.user.Dealer;
import personal.cjh.BlackJack.v1.user.Player;
import personal.cjh.BlackJack.v1.user.User;

import java.util.ArrayList;
import java.util.List;

public class BlackJackGameMain {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        // 딜러
        User dealer = new Dealer("Kim");

        // 플레이어
        User jeongHa = new Player("Cho Jeong Ha");

        list.add(dealer);
        list.add(jeongHa);

        Board gameBoard = new Board(list);
        gameBoard.play();
    }
}