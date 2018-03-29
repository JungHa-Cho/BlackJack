/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package personal.cjh.BlackJack.v1;

/**
 * 룰 인터페이스
 * 딜러와 유저 모두 적용 받는다.
 */
public interface Rule {
    /**
     * 룰 체크 ( 딜러와 플레이어가 둘다 유저임으로 둘다 룰 체크 가능 )
     * 딜러와 플레이어의 핸드가 필요하다.
     *
     * @return rule 인터페이스 구현 예정
     */
    boolean ruleCheck();
}
