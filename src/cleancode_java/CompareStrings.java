package cleancode_java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class CompareStrings {

  public static void main(final String[] args) {
    new CompareStrings();
  }

  public CompareStrings() {
    String[] names = { "Bosch", "Robert", "Bengalore", "Lenovo", "LenovoB" };
    IPredicateFunction pradicateStartsWith = new PredicateFunctionStringStartsWithCharacter();
    System.out.println(queryStrings(names, pradicateStartsWith, 'B'));

    IPredicateFunction pradicateEndsWith = new PredicateFunctionStringEndsWithCharacter();
    System.out.println(queryStrings(names, pradicateEndsWith, 'B'));
  }

  public static List<String> queryStrings(final String[] names, final IPredicateFunction pradicate,
      final char character) {
    java.util.List<String> result = new ArrayList<>();
    for (String name : names) {
      if (pradicate.apply(name, character)) {
        result.add(name);
      }
    }
    return result;
  }
}
