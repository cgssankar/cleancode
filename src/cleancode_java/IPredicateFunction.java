package cleancode_java;


@FunctionalInterface
public interface IPredicateFunction {

  boolean apply(String item, char character);
}
