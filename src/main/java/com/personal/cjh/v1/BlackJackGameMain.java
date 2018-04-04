/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v1;

import com.personal.cjh.v1.game.Board;
import com.personal.cjh.v1.user.Dealer;
import com.personal.cjh.v1.user.Player;
import com.personal.cjh.v1.user.User;

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