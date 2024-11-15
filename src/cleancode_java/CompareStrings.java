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
    String[] names = { "Bosch", "Robert", "Bengalore", "Lenovo" };
    IPradicateFunction pradicate = new PradicateFunction();
    queryStrings(names, pradicate);
  }

  public static List<String> queryStrings(final String[] names, final IPradicateFunction pradicate) {
    java.util.List<String> result = new ArrayList<>();
    for (String name : names) {
      if (pradicate.apply(name)) {
        result.add(name);
      }
    }
    return result;
  }
}
