V1 - [link](https://github.com/JungHa-Cho/GAME-BlackJack/tree/master/src/main/java/com/personal/cjh/v1)
V2 - [link](https://github.com/JungHa-Cho/GAME-BlackJack/tree/master/src/main/java/com/personal/cjh/v2)
V3 - [link](https://github.com/JungHa-Cho/GAME-BlackJack/tree/master/src/main/java/com/personal/cjh/v3)

#### 블랙잭 게임, OOP 설계 연습    
2018-03-12 : 규칙 파악 [github.io 링크 - 1편](https://jungha-cho.github.io/2018/03/12/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%84%A4%EA%B3%84-%EB%B8%94%EB%9E%99%EC%9E%AD(1)/)              
2018-03-13 : Deck 설계 [github.io 링크 - 2편](https://jungha-cho.github.io/2018/03/12/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%84%A4%EA%B3%84-%EB%B8%94%EB%9E%99%EC%9E%AD(2)/)               
2018-03-14 : Card 리팩 [github.io 링크 - 3편](https://jungha-cho.github.io/2018/03/14/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%84%A4%EA%B3%84-%EB%B8%94%EB%9E%99%EC%9E%AD(3)/)                 
2018-03-20 : Card 리팩 [github.io 링크 - 4편](https://jungha-cho.github.io/2018/03/20/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%84%A4%EA%B3%84-%EB%B8%94%EB%9E%99%EC%9E%AD(4)/)             

2018-03-26 : Hand 및 게임판 설계, [헤드 퍼스트 디자인 패턴](https://github.com/JungHa-Cho/HeadFirstDesignPattern)을 다시 공부하고 있습니다... 진도가 나가질 않네요. 처음부터 너무 큰 그림을 제대로 그리려 해서 그런걸까요?       
2018-03-26 : DIAGRAM 그리기 [github.io 링크 - 5편](https://jungha-cho.github.io/2018/03/26/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%84%A4%EA%B3%84-%EB%B8%94%EB%9E%99%EC%9E%AD(5)/)                      
2018-03-27 : BlackJack Diagram ver 2 [github.io 링크 - 6편](https://jungha-cho.github.io/2018/03/27/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%84%A4%EA%B3%84-%EB%B8%94%EB%9E%99%EC%9E%AD(6)/)                  
2018-03-29 : BlackJack Diagram ver 3 [github.io 링크 - 7편](https://jungha-cho.github.io/2018/03/29/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%84%A4%EA%B3%84-%EB%B8%94%EB%9E%99%EC%9E%AD(7)/)                 
2018-03-29 : BlackJack Diagram ver 4 [github.io 링크 - 8편](https://jungha-cho.github.io/2018/03/29/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%84%A4%EA%B3%84-%EB%B8%94%EB%9E%99%EC%9E%AD(8)/)                                 
2018-03-29 : BlackJack Diagram ver 5 [github.io 링크 - 9편](https://jungha-cho.github.io/2018/03/29/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%84%A4%EA%B3%84-%EB%B8%94%EB%9E%99%EC%9E%AD(9)/)                                                                     
2018-03-29 : BlackJack Diagram ver 6 [github.io 링크 - 10편](https://jungha-cho.github.io/2018/03/30/객체지향설계-블랙잭(10)/)                        
2018-04-02 : BlackJack Diagram ver 7 [github.io 링크 - 11편](https://jungha-cho.github.io/2018/04/01/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%84%A4%EA%B3%84-%EB%B8%94%EB%9E%99%EC%9E%AD(11)/)                                
2018-04-09 : V3 시작함!! [github.io 링크 - 13편](https://jungha-cho.github.io/2018/04/09/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%84%A4%EA%B3%84-%EB%B8%94%EB%9E%99%EC%9E%AD-13/)


2018-04-02, V2 시작
- 저자, 조정하
> 시나리오, 유저는 게임을 키면 딜러의 플레이 설명을 본뒤, 게임 스타트를 하면 카드 2장을 나눠 받는다. 
> 유저는 나눠 받은 2장과 딜러의 2장 카드를 보며 Hit와 Stay를 선택하며, 블랙잭 게임 룰에따라 끝날때까지 게임을 진행한다. 
> 초반 코인은 1,000원으로 진행하며 돈이 없어질때까지 또는 게임을 포기할때 까지 블랙잭 게임은 계속된다.

> 회피목표, 실제 블랙잭 모델은 딜러 1명과 7명의 유저까지 게임 플레이가 가능하지만, 현재 V2는 딜러 1명과 유저 1명이 게임 진행 가능하게 만든다.
> V2 버전에서는 세부 규칙 외 기본 딜러 규칙과 기본 유저 규칙만 적용한다.

> 세부사항1, 코드는 객체 지향 생활 체조를 준수 한다.
> 클래스 다이어그램을 상세하게 다시 작성해야 한다

> 미해결 문제, 유저의 세부 규칙이 미적용 되어 있다. 스플릿, 더블다운, 인셔런스, 푸시, 이븐머니, 서렌더 등

2018-04-04, V2 규칙 명세 분리
* 플레이어 규칙
* ACE : 플레이어는 ACE CARD의 점수를 1 또는 11로 카운팅 할 수 있다.
* HIT : 플에이어는 Hit 선택시 카드 숫자가 17이 되지 않으면 무조건 히트 한다.
* HIT : 21이 되지 않는 한 얼마든지 카드를 뽑을 수 있다.
* LOSE : 21이 넘으면 무조건 진다.
* WIN : 내가 이기지 않아도 딜러가 지면 무조건 이긴다.
* STAY : 내 핸드가 17 오버 이고, 딜러 핸드 또한 17 오버 일때

![blackjack_v9.JPG](/image/blackjack_v9.JPG)

2018-04-05, V2 버전 폐기.... 회고록
**문제점 리뷰..  설계가 불완전함...**
**보는 사람이 문제 없이 동작하게끔 구현 가능하지만, 스스로 코드를 사용 하는 입장에서, 설계 실패**
**사람별 룰을 분리하기위해 STRATEGY 패턴을 사용했지만 쓸모가 없음... 즉 알고리즘 군 사용하지 않음**
**TDD를 활용하지 못함. 인수 테스트 고리를 만들고 그안에서 단위 테스트 고리를 작은 단위로 굴리기 위한 실천이 안됨**
**abstract, interface 활용하지 못함... 스스로 정확하게 이해하지 못하다보니 설계에 구멍이 많음**
**리팩토링을 지속적으로 적용해 고치려 했으나, 게임 자체의 명확한 이해가 부족하다보니, 스스로 구멍이 더 많아지는 걸 느낌**
**회고록 수준으로 남겨놓기 위해 버전별로 코드 관리함**

> **코드 레벨 구조 설계법 부터 명확히 하고, 스스로 게임에 관한 명세 분석을 철저히 해 V3로 돌아오겠음**
> **공부는 계속된다!!**


2018-04-09 V3 버전 시작!!!!
2018-04-09 : Game의 인수 테스트 작성 중 game.initialize()를 완성하기 위해서는 Suit와 Denomonation이 필요하고 Card 클래스가 필요해 Card 클래스 유닛 테스트 작성을 시작함                                
2018-04-09 : TDD 원칙 준수, 테스트 없이는 코드도 없다.                         