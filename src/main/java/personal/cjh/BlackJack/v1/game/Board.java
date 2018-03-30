/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package personal.cjh.BlackJack.v1.game;

import personal.cjh.BlackJack.v1.card.Card;
import personal.cjh.BlackJack.v1.rule.DealerRule;
import personal.cjh.BlackJack.v1.rule.PlayerRule;
import personal.cjh.BlackJack.v1.user.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * 게임 보드, 게임 보드에는 딜러와 여려명의 유저들이 있다.
 */
public class Board {
    /**
     * 여러명의 유저들
     */
    private List<User> users;

    /**
     * 딜러와 유저들 저장
     *
     * @param users the users
     */
    public Board(List<User> users) {
        this.users = users;
    }

    /**
     * 잠시 룰 체크가 동작하는지 검사하기 위해 임시로 체크
     */
    public void play() {
        System.out.println("Start BlackJack!");
        // 2장씩 나눠주기
        for (int i = 0; i < 2; i++) {
            for (User user : users) {
                user.receiveCard(hit());
            }
        }

        while(true) {
            for (User user : users) {
                if (user.getRule().isBlackJack(user.hand)) {
                    System.out.println(user.name + " is Black Jack!");
                }
                if (user.getRule().isBust(user.hand)) {
                    System.out.println(user.name + " is Bust...");
                }
            }

            if (printGmae() == 1) {
                for (User user : users) {
                    if (user.getRule() instanceof PlayerRule) {
                        user.receiveCard(hit());
                    }

                    if (user.getRule() instanceof DealerRule) {
                        if (!((DealerRule) user.getRule()).isUnderSixTeen(user.hand)) {
                            user.receiveCard(hit());
                        }
                    }
                }
            } else {
                for (User user : users) {
                    if (user.getRule() instanceof DealerRule) {
                        if (user.hand.stream()
                                .mapToInt(card -> card.check().right.getProperty())
                                .sum() > 16) {
                            user.receiveCard(hit());
                        }
                    }
                }
            }
        }
    }

    private int printGmae() {
        System.out.println("------------------------------------------------------------------------");
        for (User user : users) {
            if (user.getRule() instanceof DealerRule) {
                System.out.print("|  Dealer : " + user.name);
                user.showCards();
                System.out.print("\r\n|     sum : " + user.hand.stream().mapToInt(card -> card.check().right.getProperty()).sum());
                System.out.println("");
            } else {
                System.out.println("-------------------------------------------------------------------------");
                System.out.print("|  Player : " + user.name);
                user.showCards();
                System.out.println("");
            }
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|  1. Hit ");
        System.out.println("|  2. Stay ");
        System.out.println("-------------------------------------------------------------------------");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }


    /**
     * Call Hit.
     *
     * @return the card
     */
    private Card hit() {
        User dealer = null;

        for (User user : users) {
            if (user.getRule() instanceof DealerRule) {
                dealer = user;
                //System.out.println("\r\n dealer!! - " + user.name +"\r\n");
            }
        }

        return dealer.drawCard();
    }
}