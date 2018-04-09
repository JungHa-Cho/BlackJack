/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.card;

/**
 * 끗수.
 */
public enum Denomination {
    /**
     * Ace denomination.
     */
    ACE(1),
    /**
     * Two denomination.
     */
    TWO(2),
    /**
     * Three denomination.
     */
    THREE(3),
    /**
     * Four denomination.
     */
    FOUR(4),
    /**
     * Five denomination.
     */
    FIVE(5),
    /**
     * Six denomination.
     */
    SIX(6),
    /**
     * Seven denomination.
     */
    SEVEN(7),
    /**
     * Eight denomination.
     */
    EIGHT(8),
    /**
     * Nine denomination.
     */
    NINE(9),
    /**
     * Ten denomination.
     */
    TEN(10),
    /**
     * King denomination.
     */
    KING(10),
    /**
     * Queen denomination.
     */
    QUEEN(10),
    /**
     * Jack denomination.
     */
    JACK(10);

    private final int property;

    Denomination(int property) {
        this.property = property;
    }

    /**
     * Gets property.
     *
     * @return the property
     */
    public int getProperty() {
        return property;
    }
}
