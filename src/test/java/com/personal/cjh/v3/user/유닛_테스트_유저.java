/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.user;

import com.personal.cjh.v3.card.*;
import com.personal.cjh.v3.expt.EmptyHandException;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class 유닛_테스트_유저 {

    @Test
    public void 유저는_핸드에_카드를_받을수_있다() {
        /*Hand dealerHand = mock(Hand.class);*/
        Hand playerHand = mock(Hand.class);

        /*Dealer dealer = new Dealer(dealerHand, new Deck());*/
        Player player = new Player(playerHand);

        Card card = new Card(Suit.HEART, Denomination.TEN);
        /*dealer.shuffle();*/

        /*dealer.hit();*/
        player.hit(card);

        /*verify(dealerHand).receive(card);*/
        verify(playerHand).receive(card);
    }

    @Test(expected= EmptyHandException.class)
    public void 플레이어는_핸드가_비어있으면_EXCEPTION() {
        new Player(new Hand()).counting();
    }

    @Test(expected= EmptyHandException.class)
    public void 딜러는_핸드가_비어있으면_EXCEPTION() {
        new Dealer(new Hand(), new Deck()).counting();
    }

    @Test
    public void 유저는_핸드_카운팅을_할수_있다() {
        //Dealer dealer = new Dealer(new Hand(), new Deck());
        Player player = new Player(new Hand());

        /*dealer.shuffle();

        dealer.hit();
        dealer.hit();
        dealer.hit();
        dealer.hit();
        dealer.hit();
        dealer.hit();*/

        player.hit(new Card(Suit.HEART, Denomination.JACK));
        player.hit(new Card(Suit.SPADE, Denomination.THREE));
        player.hit(new Card(Suit.CLOVER, Denomination.TWO));
        player.hit(new Card(Suit.DIAMOND, Denomination.FOUR));
        player.hit(new Card(Suit.DIAMOND, Denomination.TWO));

        //assertThat(dealer.counting(), is(25));
        assertThat(player.counting(), is(21));
    }
}