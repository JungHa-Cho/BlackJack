/*
 * Copyright (c) 2018. JeongHa-Cho all rights reserved.
 */

package personal.cjh.BlackJack.v1;

import personal.cjh.BlackJack.v1.rule.DealerRule;

import java.util.List;

/**
 * 게임 보드, 게임 보드에는 딜러와 여려명의 유저들이 있다.
 */
public class GameBoard {
    /**
     * 여러명의 유저들
     */
    List<User> users;

    /**
     * 딜러와 유저들 저장
     *
     * @param users  the users
     */
    public GameBoard(List<User> users) {
        this.users = users;
    }

    /**
     * 잠시 룰 체크가 동작하는지 검사하기 위해 임시로 체크
     */
    public void gameStart() {
        for (User user : users) {
            System.out.print(user.name + " : ");
            user.rule.ruleCheck();
        }

        // 딜러 찾기
        User dealer = null;
        for (User user : users) {
            if (user.rule instanceof DealerRule) {
                dealer = user;
                System.out.println("\r\n dealer!! - " + user.name +"\r\n");
            }
        }

        // 2장씩 나눠주기
        for (int i = 0; i < 2; i++) {
            for (User user : users) {
                user.receiveCard(dealer.drawCard());
            }
        }

        // 확인 하기
        for (User user : users) {
            System.out.print(user.name);
            user.showCards();
            System.out.print("\r\n");
        }
    }
}