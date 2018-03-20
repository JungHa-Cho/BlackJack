package personal.cjh.BlackJack.user;

import personal.cjh.BlackJack.rule.Rule;

/**
 * 플레이어 클래스
 */
public class Player implements User, Rule {
  private Hand playerHand;

  /**
   * 플레이어 또한 핸드를 가진다.
   */
  Player() {
    playerHand = new Hand();
  }

  @Override
  public Hand check() {
    playerHand.showCards();
    return playerHand;
  }

  @Override
  public Rule check(Hand dealerHand, Hand playerHand) {
    // TO-DO
    return null;
  }

  @Override
  public void drawCard() {

  }
}
