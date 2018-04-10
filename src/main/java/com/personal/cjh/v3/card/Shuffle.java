/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.card;

import java.util.Random;

/**
 * 섞기만 하려고 했는데, 책임이 분산된듯 하다.
 */
public class Shuffle {
    /**
     * The Random.
     */
    Random random;

    /**
     * Instantiates a new Shuffle.
     */
    Shuffle() {
        random = new Random();
    }

    /**
     * Index int.
     *
     * @param size the size
     * @return the int
     */
    public int getRandom(int size) {
        return random.nextInt(size);
    }
}
