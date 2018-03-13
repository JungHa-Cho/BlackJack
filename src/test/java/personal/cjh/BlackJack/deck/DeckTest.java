package personal.cjh.BlackJack.deck;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;
import personal.cjh.BlackJack.card.Denomination;
import personal.cjh.BlackJack.card.Suit;

public class DeckTest {

  @Test
  public void 덱이_싱글톤인지_검사한다() {
    // 첫번째 덱을 생성한다.
    Deck deck = new Deck();

    // 첫번째 덱의 getDeck 함수를 써서 받은 덱이 같은 덱인지 확인
    assertTrue(deck.getDeck() == deck.getDeck());
    assertFalse(deck == null);
    assertTrue(deck instanceof Deck);
    assertTrue(deck.getDeck().size() == deck.getDeck().size());

    // 카드를 뽑는다.
    deck.getCard();

    // 카드를 뽑아도 같은 객체인지 검사한다.
    assertTrue(deck.getDeck() == deck.getDeck());
    assertFalse(deck == null);
    assertTrue(deck instanceof Deck);
    assertTrue(deck.getDeck().size() == deck.getDeck().size());

    // 두번째 덱을 만든다.
    Deck deck2 = new Deck();

    // 두번째 덱의 getDeck 함수를 써서 받은 덱이 같은 덱인지 확인
    assertTrue(deck2.getDeck() == deck2.getDeck());
    assertFalse(deck2 == null);
    assertTrue(deck2 instanceof Deck);
    assertTrue(deck2.getDeck().size() == deck2.getDeck().size());

    // 카드를 뽑는다.
    deck2.getCard();

    // // 카드를 뽑아도 같은 객체인지 검사한다.
    assertTrue(deck2.getDeck() == deck2.getDeck());
    assertFalse(deck2 == null);
    assertTrue(deck2 instanceof Deck);
    assertTrue(deck2.getDeck().size() == deck2.getDeck().size());

    assertFalse(deck.getDeck() == deck2.getDeck());
  }

  @Test
  public void getCard_함수를_사용했을때_덱안의_카드가_정상적으로_줄어드는지_검사() {
    Deck deck = new Deck();

    // 블랙잭 덱은 최초 52장이다.
    assertThat(deck.getDeck().size(), is(52));

    // 카드 뽑기
    Pair<Suit, Denomination> card = deck.getCard();

    // 뽑은 카드가 각 Enum의 객체가 맞는지 검사
    assertThat(card.getLeft(), instanceOf(Suit.class));
    assertThat(card.getRight(), instanceOf(Denomination.class));

    assertThat(deck.getDeck().size(), is(51));

    // 순환을 돌면서 정상적으로 DECK 사이즈가 줄어드는지 검사
    int count = 51;
    while (deck.getDeck().size() != 0) {
      Pair<Suit, Denomination> cd = deck.getCard();
      printCard(cd, count); // 카드 덱 출력을 보기 위한 함수 출력
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