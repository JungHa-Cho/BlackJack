/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3;

import com.personal.cjh.v3.card.Deck;
import com.personal.cjh.v3.card.Hand;
import com.personal.cjh.v3.user.Dealer;
import com.personal.cjh.v3.user.Player;
import org.junit.Ignore;
import org.junit.Test;

public class 인수_테스트 {

    @Test
    public void 블랙잭_게임_시작시_초기화되는_메소드가_실행되는지() {
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

    /**
     * 블랙잭 게임의 시작시 초기화.
     *
     * 딜러가 자기 자신 포함 모든 유저에게 2장씩 나눠준다.
     * 딜러는 카드 한장만 오픈한다.
     */
    @Ignore
    @Test
    public void 블랙잭_게임을_시작하기위한_초기화가_가능한가() {

    }

    /**
     * 기본적으로 한개의 스테이지마다 스코어 계산이 가능해야 함.
     */
    @Ignore
    @Test
    public void 블랙잭_게임의_한개_스테이지마다_스코어_계산이_가능한가() {

    }

    /**
     * 게임 객체에서 승자, 패자, 무승부 판단이 되어야 함.
     */
    @Ignore
    @Test
    public void 블랙잭_게임의_한개_스테이지마다_블랙잭_규칙을_적용해_승자_패자_무승부_계산이_가능한가() {

    }

    /**
     * 게임 도중 스테이지마다 딜러에게 규칙이 적용 되어야 함.
     */
    @Ignore
    @Test
    public void 블랙잭_게임의_한개_스테이지마다_딜러_규칙이_적용_가능한가() {

    }

    /**
     * 게임 도중 스테이지마다 플레이어에게 규칙이 적용되어야 함.
     */
    @Ignore
    @Test
    public void 블랙잭_게임의_한개_스테이지마다_플레이어에게_규칙이_적용_가능한가() {

    }
}
