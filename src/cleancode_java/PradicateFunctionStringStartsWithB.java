package cleancode_java;


public class PradicateFunctionStringStartsWithB implements IPradicateFunction {

  @Override
  public boolean apply(final String item) {
    return isStringStartsWithB(item);
  }

  public boolean isStringStartsWithB(final String item) {
    return item.charAt(0) == 'B';
  }
}