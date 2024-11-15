package cleancode_java;


/**
 *
 */
public class PradicateFunctionStringEndsWithB implements IPradicateFunction {

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean apply(final String item) {
    return item.charAt(item.length() - 1) == 'B';
  }

}
