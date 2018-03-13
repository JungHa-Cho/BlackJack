package personal.cjh.BlackJack;

import org.apache.commons.lang3.tuple.ImmutablePair;
import personal.cjh.BlackJack.card.Denomination;
import personal.cjh.BlackJack.card.Suit;
import personal.cjh.BlackJack.deck.Deck;

public class BlackJackGameMain {
  public static void main(String[] args) {
    Deck deck = new Deck();

    int size = deck.getDeck().size();
    for (int i = 1 ; i <= size; i++) {
      ImmutablePair<Suit, Denomination> card = deck.getCard();
      StringBuilder sb = new StringBuilder();
      sb.append("COUNT : ");
      sb.append(i);
      sb.append(" Suit : ");
      sb.append(card.getLeft());
      sb.append(" Suit Prop : ");
      sb.append(card.getLeft().getProperty());
      sb.append(" Denomination : ");
      sb.append(card.getRight());
      sb.append(" Denomination Prop : ");
      sb.append(card.getRight().getProperty());
      System.out.println(sb.toString());
      sb.setLength(0);
    }
  }
}