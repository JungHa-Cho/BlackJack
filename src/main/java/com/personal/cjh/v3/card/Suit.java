/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.card;

/**
 * 카드의 모양 속성.
 */
public enum Suit {
    /**
     * Spade suit.
     */
    SPADE("SPADE"),
    /**
     * Diamond suit.
     */
    DIAMOND("DIAMOND"),
    /**
     * Clover suit.
     */
    CLOVER("CLOVER"),
    /**
     * Heart suit.
     */
    HEART("HEART");

    private final String property;

    Suit(String property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return property;
    }
}
