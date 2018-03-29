/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package personal.cjh.BlackJack.v1;

/**
 * 플레이어 클래스
 */
public class Player extends User {

    /**
     * 플레이어는 핸드를 가진다.
     */
    Player() {
        super();
    }

    void handCheck() {
        // 가진 핸드를 체크함
    }

    Card drawCard() {
        // drawCard 카드를 요청함
        return null;
    }

    public boolean ruleCheck() {
        // 플레이어에게 주어진 rule을 체크함
        return false;
    }
}
