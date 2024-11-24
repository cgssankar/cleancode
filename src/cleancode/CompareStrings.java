package cleancode;

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
    PredicateFunctionStringStartsWithCharacter predicateStartsWith = new PredicateFunctionStringStartsWithCharacter();
    predicateStartsWith.setStartsWith('B');
    System.out.println(queryStrings(names, predicateStartsWith));

    PredicateFunctionStringEndsWithCharacter predicateEndsWith = new PredicateFunctionStringEndsWithCharacter();
    predicateEndsWith.setEndsWith('B');
    System.out.println(queryStrings(names, predicateEndsWith));

    PredicateFunctionStringLength prediacateLength = new PredicateFunctionStringLength();
    prediacateLength.setLenth(6);
    System.out.println(queryStrings(names, prediacateLength));


  }

  public static List<String> queryStrings(final String[] names, final IPredicateFunction pradicate) {
    java.util.List<String> result = new ArrayList<>();
    for (String name : names) {
      if (pradicate.apply(name)) {
        result.add(name);
      }
    }
    return result;
  }
}
