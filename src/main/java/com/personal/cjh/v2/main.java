/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2;

import com.personal.cjh.v2.game.Board;
import com.personal.cjh.v2.rule.ace.UnlessBust;
import com.personal.cjh.v2.rule.ace.PlayerChoice;
import com.personal.cjh.v2.rule.hit.HitChoice;
import com.personal.cjh.v2.rule.hit.UnderSevenTeen;
import com.personal.cjh.v2.rule.stay.OverSevenTeen;
import com.personal.cjh.v2.rule.stay.UnconditionalStay;
import com.personal.cjh.v2.user.Dealer;
import com.personal.cjh.v2.user.Player;

public class main {
    public static void main(String[] args) {
        Player jeongha = new Player(new UnderSevenTeen(), new OverSevenTeen(), new PlayerChoice());
        Dealer dealer = new Dealer(new HitChoice(), new UnconditionalStay(), new UnlessBust());
        Board board = new Board(jeongha, dealer);
        board.gameStart();
    }
}
