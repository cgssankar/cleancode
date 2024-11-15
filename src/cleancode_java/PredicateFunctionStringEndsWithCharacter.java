package cleancode_java;


/**
 *
 */
public class PredicateFunctionStringEndsWithCharacter implements IPredicateFunction {

  private char endsWith;

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean apply(final String item) {
    return item.charAt(item.length() - 1) == this.endsWith;
  }

  public void setEndsWith(final char character) {
    this.endsWith = character;
  }
}
