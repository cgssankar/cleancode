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
    IPradicateFunction pradicateStartsWithB = new PradicateFunctionStringStartsWithCharacter();
    System.out.println(queryStrings(names, pradicateStartsWithB, 'B'));

    IPradicateFunction pradicateEndsWithB = new PradicateFunctionStringEndsWithCharacter();
    System.out.println(queryStrings(names, pradicateEndsWithB, 'B'));
  }

  public static List<String> queryStrings(final String[] names, final IPradicateFunction pradicate,
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
