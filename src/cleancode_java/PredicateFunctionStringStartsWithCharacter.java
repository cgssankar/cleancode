package cleancode_java;


public class PredicateFunctionStringStartsWithCharacter implements IPredicateFunction {

  @Override
  public boolean apply(final String item, final char character) {
    return item.charAt(0) == character;
  }

}