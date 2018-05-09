/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.user;

import com.personal.cjh.v3.card.Deck;
import com.personal.cjh.v3.card.Hand;
import com.personal.cjh.v3.expt.EmptyHandException;
import org.junit.Test;

/**
 * @author cho_jeong_ha
 * @project BlackJack
 * @update 2018-04-13
 **/
public class 유닛_테스트_딜러 {

    @Test
    public void 딜러는_핸드에_카드를_받을수_있다() {
    }

    @Test(expected= EmptyHandException.class)
    public void 딜러는_핸드가_비어있으면_EXCEPTION() {
        new Dealer(new Hand(), new Deck()).counting();
    }

    @Test
    public void 딜러는_핸드_카운팅을_할수있다() {
        //Dealer dealer = new Dealer(new Hand(), new Deck());
        /*dealer.shuffle();

        dealer.hit();
        dealer.hit();
        dealer.hit();
        dealer.hit();
        dealer.hit();
        dealer.hit();*/

        //assertThat(dealer.counting(), is(25));
    }
}

