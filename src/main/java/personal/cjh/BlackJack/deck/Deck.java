package personal.cjh.BlackJack.deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.tuple.ImmutablePair;
import personal.cjh.BlackJack.card.Card;
import personal.cjh.BlackJack.card.Denomination;
import personal.cjh.BlackJack.card.Suit;

public class Deck extends Card {
  private final List<ImmutablePair<Suit, Denomination>> deck = new ArrayList<>();
  private final Random random = new Random();

  public Deck() {
    for (int i = 0; i < Suit.values().length; i++) {
      for (int j = 0; j < Denomination.values().length; j++) {
        ImmutablePair<Suit, Denomination> temp
            = new ImmutablePair<>(Suit.values()[i], Denomination.values()[j]);
        deck.add(temp);
      }
    }
  }

  @Override
  public ImmutablePair<Suit, Denomination> getCard() {
    int index = random.nextInt(deck.size());
    ImmutablePair<Suit, Denomination> card = deck.get(index);
    deck.remove(index);
    return card;
  }

  public List<ImmutablePair<Suit, Denomination>> getDeck() {
    return deck;
  }
}
