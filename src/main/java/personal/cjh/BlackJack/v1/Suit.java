package personal.cjh.BlackJack.v1;

/**
 * The Enumeration Suit.
 * 한벌, 한세트를 뜻함
 * 스페이드, 다이아몬드, 클로버, 하트
 */
public enum Suit {
    /**
     * SPADE, DIAMOND, CLOVER, HEART
     */
    SPADE("SPADE"), DIAMOND("DIAMOND"), CLOVER("CLOVER"), HEART("HEART");

    private String Property;

    Suit(String property) {
        this.Property = property;
    }

    /**
     * 속성을 출력합니다.
     *
     * @return the property
     */
    public String getProperty() {
        return Property;
    }
}
