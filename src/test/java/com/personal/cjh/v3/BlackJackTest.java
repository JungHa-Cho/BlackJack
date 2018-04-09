/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3;

import org.junit.Before;
import org.junit.Test;

public class BlackJackTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void canStart() {
        game.start();
    }

    @Test
    public void canInitialize() {
        /* 카드 두장씩 나눠주기 테스트 인수 테스트*/
        game.initialize();
    }
}
