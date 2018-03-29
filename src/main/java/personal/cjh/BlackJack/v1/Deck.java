/*
 * Copyright (c) 2018. JeongHa, Cho
 */

package personal.cjh.BlackJack.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 덱 클래스 입니다.
 * 덱 또한 여러장의 카드를 모아논 것이기 때문에 클래스를 이용했습니다.
 */
public class Deck {
    private final List<Card> deck = new ArrayList<>();
    private final Random random = new Random();

    /**
     * 덱을 생성할때 새로운 카드를 deck list에 넣습니다.
     * 덱은 각각의 덱별로 블랙잭 카드 개수인 52장씩 생성됩니다.
     */
    public Deck() {
        for (int i = 0; i < Suit.values().length; i++) {
            for (int j = 0; j < Denomination.values().length; j++) {
                deck.add(new Card(Suit.values()[i], Denomination.values()[j]));
            }
        }
    }

    /**
     * 덱에서 카드를 드로우 합니다.
     * 실제로 드로우 하는 주최는 딜러가 될것이며, 유저는 딜러에게 요청만 하게 됩니다.
     * Deck 리스트에서 랜덤으로 하나 출력 후 해당 카드는 삭제 합니다.
     *
     * @return 카드 객체로 반환
     */
    public Card drawCard() {
        int index = random.nextInt(deck.size());
        Card card = deck.get(index);
        deck.remove(index);
        return card;
    }

    /**
     * 덱 리스트 변수에 접근하기 위한 메소드
     *
     * @return 덱 리스트를 반환합니다
     */
    public List<Card> getDeck() {
        return deck;
    }
}
