package cleancode_java;


public class PradicateFunctionStringStartsWithCharacter implements IPradicateFunction {

  @Override
  public boolean apply(final String item, final char character) {
    return item.charAt(0) == character;
  }

}