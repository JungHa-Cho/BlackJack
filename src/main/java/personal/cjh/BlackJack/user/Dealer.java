package personal.cjh.BlackJack.user;

import personal.cjh.BlackJack.card.Card;
import personal.cjh.BlackJack.deck.Deck;
import personal.cjh.BlackJack.rule.Rule;

/**
 * 딜러 클래스
 * 딜러 또한 유저이고, 룰을 적용 받는다.
 */
public class Dealer extends User {
  private Deck dealerDeck;

  /**
   * 딜러는 핸드와 덱을 가진다.
   */
  Dealer() {
    super();
    dealerDeck = new Deck();
  }

  @Override
  void handCheck() {
    // 가진 핸드를 체크한다.
  }

  @Override
  Card drawCard() {
    // 덱에서 카드를 꺼내 딜러 핸드에 넣는다.
    return null;
  }

  @Override
  public Rule ruleCheck(Hand hand) {
    // 딜러에게 주어진 룰을 체크함
    return null;
  }
}
