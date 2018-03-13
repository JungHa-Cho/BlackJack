package personal.cjh.BlackJack.card;

import org.apache.commons.lang3.tuple.ImmutablePair;

public abstract class Card {
  public abstract ImmutablePair<Suit, Denomination> getCard();
}
