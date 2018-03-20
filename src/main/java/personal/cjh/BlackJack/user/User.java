package personal.cjh.BlackJack.user;

import personal.cjh.BlackJack.rule.Rule;

/**
 * 유저 인터페이스 정의
 */
public interface User {

  /**
   * 단순 핸드를 체크, 출력하는 함수
   *
   * @return 가지고 있는 핸드를 반환
   */
  Hand check();

  /**
   * 룰 체크 ( 딜러와 플레이어가 둘다 유저임으로 둘다 룰 체크 가능 )
   * 딜러와 플레이어의 핸드가 필요하다.
   *
   * @return rule 인터페이스 구현 예정
   */
  Rule check(Hand dealerHand, Hand playerHand);

  /**
   * 카드를 받는다.
   * 딜러는 덱으로부터, 플레이어는 딜러로부터
   */
  void drawCard();
}
