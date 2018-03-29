package personal.cjh.BlackJack;

import personal.cjh.BlackJack.v1.Card;
import personal.cjh.BlackJack.v1.Deck;

public class BlackJackGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();

        int size = deck.getDeck().size();
        for (int i = 1; i <= size; i++) {
            Card card = deck.drawCard();
            StringBuilder sb = new StringBuilder();
            sb.append("COUNT : ");
            sb.append(i);
            sb.append(" Suit : ");
            sb.append(card.check().getLeft());
            sb.append(" Suit Prop : ");
            sb.append(card.check().getLeft().getProperty());
            sb.append(" Denomination : ");
            sb.append(card.check().getRight());
            sb.append(" Denomination Prop : ");
            sb.append(card.check().getRight().getProperty());
            System.out.println(sb.toString());
            sb.setLength(0);
        }
    }
}