/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.card;

import javafx.util.Pair;

/**
 * The type Card.
 */
public class Card {
    private Pair<Suit, Denomination> card;

    /**
     * Instantiates a new Card.
     *
     * @param suit         the suit
     * @param denomination the denomination
     */
    public Card(Suit suit, Denomination denomination) {
        card = new Pair<>(suit, denomination);
    }

    /**
     * Is equal boolean.
     *
     * @param o the Suit 또는 Denomination만 비교 가능
     * @return the boolean
     */
    public boolean isEqual(Object o) {
        if (o instanceof Suit) {
            String suit = getSuit();
            return ((Suit) o).toString().equals(suit);
        } else if (o instanceof Denomination) {
            return ((Denomination) o).getProperty() == getDenomination();
        }
        return false;
    }

    private String getSuit() {
        return this.card.getKey().toString();
    }

    private int getDenomination() {
        return this.card.getValue().getProperty();
    }
}
