package java.cleancode;


public class PredicateFunctionStringStartsWithCharacter implements IPredicateFunction {

  private char startsWith;

  @Override
  public boolean apply(final String item) {
    return item.charAt(0) == this.startsWith;
  }

  public void setStartsWith(final char character) {
    this.startsWith = character;
  }

}