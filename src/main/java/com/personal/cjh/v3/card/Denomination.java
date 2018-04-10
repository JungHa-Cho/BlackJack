/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.card;

/**
 * 끗수.
 */
public enum Denomination {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5),
    SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    KING(10), QUEEN(10), JACK(10);

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
