/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package personal.cjh.BlackJack.v1.rule;

/**
 * Player Rule
 */
public class PlayerRule implements Rule {
    @Override
    public boolean ruleCheck() {
        System.out.println("Player Rule");
        return false;
    }
}
