package personal.cjh.BlackJack.card;

/**
 * 끗수 Enum
 * 블랙잭 게임의 끗수, 즉 숫자 1~10, J, Q, K, A를 표시하는 Enumeration
 */
public enum Denomination {
  ACE("1"), TWO("2"), THREE("3"), FOUR("4"),
  FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"),
  NINE("9"), TEN("10"), JACK("10"), QUEEN("10"),
  KING("10");

  private String Property;

  Denomination(String property) {
    this.Property = property;
  }

  /**
   * Gets property.
   *
   * @return the property
   */
  public String getProperty() {
    return Property;
  }
}
