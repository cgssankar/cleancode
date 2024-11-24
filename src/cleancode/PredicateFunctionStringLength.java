/*
 * Copyright (c) ETAS GmbH 2024. All rights reserved.
 */
package cleancode;


/**
 *
 */
public class PredicateFunctionStringLength implements IPredicateFunction {

  private int length;

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean apply(final String item) {
    return item.length() > this.length;
  }

  public void setLenth(final int greaterthan) {
    this.length = greaterthan;
  }

}
