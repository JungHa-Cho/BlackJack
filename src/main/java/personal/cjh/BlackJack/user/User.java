/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package personal.cjh.BlackJack.user;

import personal.cjh.BlackJack.card.Card;
import personal.cjh.BlackJack.rule.Rule;

/**
 * 유저 추상 클래스 정의
 */
public abstract class User extends Hand implements Rule {
  /**
   * 핸드 초기화
   */
  User() {
    super();
  }

  /**
   * 단순 핸드를 체크, 출력하는 함수
   *
   * @return 가지고 있는 핸드를 반환
   */
  abstract void handCheck();

  /**
   * 카드를 받는다.
   * 딜러는 덱으로부터, 플레이어는 딜러로부터
   */
  abstract Card drawCard();
}
