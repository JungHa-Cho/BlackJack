/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package personal.cjh.BlackJack;


import personal.cjh.BlackJack.v1.Dealer;
import personal.cjh.BlackJack.v1.GameBoard;
import personal.cjh.BlackJack.v1.Player;
import personal.cjh.BlackJack.v1.User;

import java.util.ArrayList;
import java.util.List;

public class BlackJackGameMain {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User dealer = new Dealer("Kim");
        User jeongHa = new Player("Cho Jeong Ha");
        User park = new Player("Park");

        list.add(dealer);
        list.add(jeongHa);
        list.add(park);

        GameBoard gameBoard = new GameBoard(list);
        gameBoard.gameStart();
    }
}