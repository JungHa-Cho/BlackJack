package personal.cjh.BlackJack;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackJackGameMainTest {

  @Test
  public void main() {
    BlackJackGameMain bjgm = new BlackJackGameMain();
    String[] a = {"", ""};
    bjgm.main(a);
  }
}