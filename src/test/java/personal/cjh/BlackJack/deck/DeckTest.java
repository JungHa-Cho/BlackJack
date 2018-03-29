package personal.cjh.BlackJack.deck;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;
import personal.cjh.BlackJack.v1.Card;
import personal.cjh.BlackJack.v1.Deck;
import personal.cjh.BlackJack.v1.Denomination;
import personal.cjh.BlackJack.v1.Suit;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DeckTest {
    @Test
    public void 인스턴스로_생성된_덱의_유효성_검사() {
        // GIVEN
        Deck deck = new Deck();

        // WHEN
        boolean nullPointCheck = deck == null;
        boolean instanceCheck = deck instanceof Deck;
        boolean deckSizeCheck = deck.getDeck().size() == deck.getDeck().size();

        deck.drawCard();

        // THEN
        assertFalse(nullPointCheck);
        assertTrue(instanceCheck);
        assertTrue(deckSizeCheck);
    }

    @Test
    public void 덱에서_카드를_뽑았을때_덱의_상태변화를_검사한다() {
        // GIVEN
        Deck deck = new Deck();

        // WHEN
        int beforeDeckSize = deck.getDeck().size();
        Card card = deck.drawCard();
        int afterDeckSize = deck.getDeck().size();

        // THEN
        assertFalse(beforeDeckSize == afterDeckSize);
        assertTrue(beforeDeckSize == 52);
        assertTrue(afterDeckSize == 51);
    }

    @Test
    public void 덱에서_카드를_뽑았을때_카드의_유효성을_검사한다() {
        // GIVEN
        Deck deck = new Deck();

        // WHEN
        Card card = deck.drawCard();

        // THEN
        assertTrue(card != null);
        assertThat(card, instanceOf(Card.class));
        assertThat(card.check(), instanceOf(ImmutablePair.class));
        assertThat(card.check().left, instanceOf(Suit.class));
        assertThat(card.check().right, instanceOf(Denomination.class));
    }

    @Test
    public void 덱이_싱글톤인지_검사한다() {
        // GIVEN
        Deck deck = new Deck();
        Deck deck2 = new Deck();

        // WHEN
        boolean beforeDrawCheck = (deck.getDeck() == deck.getDeck());
        deck.drawCard();
        boolean afterDrawCheck = (deck.getDeck() == deck.getDeck());
        boolean isEqual = (deck.getDeck() == deck2.getDeck());

        // THEN
        assertTrue(beforeDrawCheck);
        assertTrue(afterDrawCheck);
        assertFalse(isEqual);
    }

    @Test
    public void 덱이_생성됐을때_중복된_카드가_있는지_검사() {
        // GIVEN
        Deck deck = new Deck();
        deck.getDeck().add(new Card(Suit.CLOVER, Denomination.ACE));

        // WHEN
        List<ImmutablePair<Suit, Denomination>> s = new ArrayList<>();
        int deckSize = deck.getDeck().size();
        for (int i = 0; i < deckSize; i++) {
            Card card = deck.drawCard();
            System.out.println(card.check().left + ", " + card.check().right);
            if (s.size() == 0) {
                s.add(card.check());
            } else {
                for (int j = 0; j < s.size(); j++) {
                    if (s.get(j).left.equals(card.check().left)) {
                        if (s.get(j).right.equals(card.check().right)) {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }

        // THEN

    }

    @Test
    public void getCard_함수를_사용했을때_덱안의_카드가_정상적으로_줄어드는지_검사() {
        // GIVEN
        Deck deck = new Deck();

        // WHEN
        boolean initSizeEqual = (deck.getDeck().size() == 52);
        Card card = deck.drawCard();

        // THEN
        assertThat(card.check().getLeft(), instanceOf(Suit.class));
        assertThat(card.check().getRight(), instanceOf(Denomination.class));
        assertThat(deck.getDeck().size(), is(51));

        int count = 51;
        while (deck.getDeck().size() != 0) {
            Card cd = deck.drawCard();
            printCard(cd.check(), count);
            assertThat(deck.getDeck().size(), is(--count));
        }
    }

    public void printCard(Pair<Suit, Denomination> card, int count) {
        StringBuilder sb = new StringBuilder();
        sb.append("COUNT : ");
        sb.append(count);
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