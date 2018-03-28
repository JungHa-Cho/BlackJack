package personal.cjh.BlackJack.user;

import personal.cjh.BlackJack.card.Card;
import personal.cjh.BlackJack.rule.Rule;

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

  @Override
  void handCheck() {
    // 가진 핸드를 체크함
  }

  @Override
  Card drawCard() {
    // drawCard 카드를 요청함
    return null;
  }

  @Override
  public Rule ruleCheck(Hand hand) {
    // 플레이어에게 주어진 rule을 체크함
    return null;
  }
}
