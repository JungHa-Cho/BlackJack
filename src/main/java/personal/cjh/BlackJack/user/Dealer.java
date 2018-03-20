package personal.cjh.BlackJack.user;

import personal.cjh.BlackJack.deck.Deck;
import personal.cjh.BlackJack.rule.Rule;

/**
 * 딜러 클래스
 * 딜러 또한 유저이고, 룰을 적용 받는다.
 */
public class Dealer implements User, Rule {
  private Hand dealerHand;
  private Deck dealerDeck;

  /**
   * 딜러 한명을 생성
   * 딜러는 핸드와 덱을 가진다.
   */
  Dealer() {
    dealerHand = new Hand();
    dealerDeck = new Deck();
  }

  @Override
  public Hand check() {
    return null;
  }

  @Override
  public Rule check(Hand dealerHand, Hand playerHand) {
    return null;
  }

  @Override
  public void drawCard() {
    dealerHand.receiveCard(dealerDeck.drawCard());
  }
}
