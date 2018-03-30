/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package personal.cjh.BlackJack.v1.rule;

import personal.cjh.BlackJack.v1.card.Card;

import java.util.List;

/**
 * 딜러 룰이 플레이어보다 단순하니 딜러 먼저 규칙 적용해보기!
 */
public class DealerRule implements Rule {
    // Dealer 룰
    // 딜러는 플레이어의 패를보고 플레이 하는것이 아니라, 단순 규칙에 따라 기계적으로 플레이 한다.
    // 1. 16이하면 무조건 히트, 17 이상이면 무조건 스테이
    // 2. 플레이어가 15에서 스테이 했고, 딜러는 16일때 딜러가 스테이하면 플레이어를 이길 수 있다.
    //    하지만 딜러는 의무적으로 1의 규칙이 적용되어 버스트 위험을 감수하고 무조건 히트 한다.
    // 3. 플레이어가 18에서 스테이했고, 딜러는 17일때, 딜러가 히트를해서 A~4 카드가 나오면 비기거나 이길 수 있다.
    //    하지만 딜러는 히트할 수 없고 스테이 해야 한다.
    // 4. 당연하지만, 딜러는 스플릿, 더블다운, 서렌더, 인셔런스를 할 수 없다. 이것은 플레이어 규칙이다.
    // 5. 딜러는 버스트 되지 않는 한 A는 11로 카운타 한다. 예를 들어 A-6이라면 17이 되며
    //    딜러 규칙에 의해 무조건 스테이 한다는 것을 의미 한다.
    //    단 일부 카지노에서는 딜러가 소프트17, 즉 A-6의 경우에도 히트하는 경우도 있다.

    @Override
    public boolean isBlackJack(List<Card> cardList) {
        // JAVA 1.8 STREAM API
        // list 숫자를 순회 돌면서 더한뒤 21이면 참
        return cardList.stream()
                .mapToInt(card -> card.check().right.getProperty())
                .sum() == 21;
    }

    @Override
    public boolean isBust(List<Card> cardList) {
        return cardList.stream()
                .mapToInt(card -> card.check().right.getProperty())
                .sum() > 21;
    }

    public boolean isUnderSixTeen(List<Card> cardList) {
        return cardList.stream()
                .mapToInt(card -> card.check().right.getProperty())
                .sum() >= 17;
    }
}
