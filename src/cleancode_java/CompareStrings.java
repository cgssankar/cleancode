/*
 * Copyright (c) ETAS GmbH 2024. All rights reserved.
 */
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
    System.out.println(getStringsStartsWithB(names));
  }

  private List<String> getStringsStartsWithB(final String[] names) {
    java.util.List<String> result = new ArrayList<>();
    for (String name : names) {
      if (name.startsWith("B")) {
        result.add(name);
      }
    }
    return result;
  }


}
