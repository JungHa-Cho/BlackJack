/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v2.user;

import com.personal.cjh.v2.rule.ace.PlayerChoice;
import com.personal.cjh.v2.rule.ace.UnlessBust;
import com.personal.cjh.v2.rule.hit.HitChoice;
import com.personal.cjh.v2.rule.hit.UnderSevenTeen;
import com.personal.cjh.v2.rule.stay.OverSevenTeen;
import com.personal.cjh.v2.rule.stay.UnconditionalStay;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class 플레이어_단위_테스트 {
    Player jeongha;
    Dealer dealer;

    @Before
    public void setUp() throws Exception {
        jeongha = new Player(new UnderSevenTeen(), new OverSevenTeen(), new PlayerChoice());
        dealer = new Dealer(new HitChoice(), new UnconditionalStay(), new UnlessBust());
    }

    @After
    public void tearDown() throws Exception {
        jeongha = null;
    }

    @Test
    public void 플레이어_ACE_카드는_1_또는_11로_계산되는지() {
        // Given
        dealer.shuffleTheCard();

        // When
        //boolean then = jeongha.checkAce();

        // Then
        //assertThat(then).isTrue();
    }

    @Test
    public void checkStay() {
    }

    @Test
    public void checkHit() {
    }

    @Test
    public void showCard() {
    }

    @Test
    public void receiveCard() {
    }
}