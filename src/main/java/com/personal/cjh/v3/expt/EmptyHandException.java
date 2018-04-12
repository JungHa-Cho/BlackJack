/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.expt;

/**
 * @author JoengHa-Cho
 * @project BlackJack
 * @update 2018-04-12
 **/
public class EmptyHandException extends RuntimeException {

    public EmptyHandException() {
        super();
    }

    public EmptyHandException(String message) {
        super(message);
    }
}
