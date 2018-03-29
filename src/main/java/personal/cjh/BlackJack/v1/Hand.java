/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package personal.cjh.BlackJack.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 각 유저가 들고 있는 핸드, 카드의 집합
 */
public abstract class Hand {
  List<Card> hand;

  /**
   * Hand는 유저당 하나씩
   */
  Hand() {
    hand = new ArrayList<>();
  }

  /**
   * 드로우 카드 했을때,
   * 호출해서 핸드에 넣어야 하는 셋 메소드
   *
   * @param received the received
   */
  void receiveCard(Card received) {
    hand.add(received);
  }

  /**
   * 가지고 있는 카드를 모두 보여줌
   */
  void showCards() {
    ListIterator<Card> is = hand.listIterator();
    while (is.hasNext()) {
      Card card = is.next();
      System.out.println("Suit : " + card.check().left + "Denomination : " + card.check().right);
    }
  }
}
