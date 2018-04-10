/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package com.personal.cjh.v3.expt;

public class EmptyDeckException extends RuntimeException {

    public EmptyDeckException() {
        super();
    }

    public EmptyDeckException(String message) {
        super(message);
    }
}
