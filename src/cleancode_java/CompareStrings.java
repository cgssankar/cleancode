package cleancode_java;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface IPradicateFunction {

  boolean apply(String item);
}

public class PradicateFunction implements IPradicateFunction {

  @Override
  public boolean apply(final String item) {
    return isStringStartsWithB(item);
  }

  public boolean isStringStartsWithB(final String item) {
    return item.charAt(0) == 'B';
  }
}

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
//    System.out.println(getStringsStartsWith(names, 'B'));
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
