/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.user;

import com.personal.cjh.v3.card.Card;

public interface User {
    void hit(Card card);
    void stay();
    int counting();
}
