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

public class 유닛_테스트_플레이어 {

    @Test
    public void 유저는_핸드에_카드를_받을수_있다() {
        Hand playerHand = mock(Hand.class);
        Player player = new Player(playerHand);
        Card card = new Card(Suit.HEART, Denomination.TEN);
        player.hit(card);
        verify(playerHand).receive(card);
    }

    @Test(expected= EmptyHandException.class)
    public void 플레이어는_핸드가_비어있으면_EXCEPTION() {
        new Player(new Hand()).counting();
    }

    @Test
    public void 플레이어는_핸드_카운팅을_할수_있다() {
        Player player = new Player(new Hand());

        player.hit(new Card(Suit.HEART, Denomination.JACK));
        player.hit(new Card(Suit.SPADE, Denomination.THREE));
        player.hit(new Card(Suit.CLOVER, Denomination.TWO));
        player.hit(new Card(Suit.DIAMOND, Denomination.FOUR));
        player.hit(new Card(Suit.DIAMOND, Denomination.TWO));

        assertThat(player.counting(), is(21));
    }
}