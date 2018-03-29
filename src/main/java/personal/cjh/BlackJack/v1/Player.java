/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package personal.cjh.BlackJack.v1;

import personal.cjh.BlackJack.v1.rule.PlayerRule;

/**
 * 플레이어 클래스
 */
public class Player extends User {
    /**
     * 플레이어는 핸드를 가진다.
     * 플레이어의 룰을 적용받는다.
     */
    public Player(String name) {
        super();
        this.name = name;
        rule = new PlayerRule();
    }

    @Override
    Card drawCard() {
        // drawCard 카드를 요청함
        return null;
    }
}
