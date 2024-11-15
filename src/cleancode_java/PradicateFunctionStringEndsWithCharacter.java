package cleancode_java;


/**
 *
 */
public class PradicateFunctionStringEndsWithCharacter implements IPradicateFunction {

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean apply(final String item, final char character) {
    return item.charAt(item.length() - 1) == character;
  }

}
