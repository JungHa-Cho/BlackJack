/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package personal.cjh.BlackJack.v1.rule;

public class DealerRule implements Rule {
    @Override
    public boolean ruleCheck() {
        System.out.println("Dealer Rule");
        return false;
    }
}
