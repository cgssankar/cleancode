package cleancode_java;


/**
 *
 */
public class PredicateFunctionStringEndsWithCharacter implements IPredicateFunction {

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean apply(final String item, final char character) {
    return item.charAt(item.length() - 1) == character;
  }

}
