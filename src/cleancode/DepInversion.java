/*
 * Copyright (c) ETAS GmbH 2024. All rights reserved.
 */
package cleancode;


//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class RC {

  private String vehicleRegNo;

  // Constructor
  RC() {
    System.out.println("RC Constructed");
  }
}

class NexDigitronTPMS implements ITMPSValueProvider {

  // Constructor
  NexDigitronTPMS() {
    System.out.println("NexDigitronTPMS Constructed");
  }

  @Override
  public String getCurrentPressureValues() {
    return "NexDigitronTPMS value";
  }
}

class BoschTPMS implements ITMPSValueProvider {

  // Constructor
  BoschTPMS() {
    System.out.println("BoschTPMS Constructed");
  }

  @Override
  public String getCurrentPressureValues() {
    return "BoschTPMS value";
  }
}

class Engine {

  // Constructor
  Engine() {
    System.out.println("Engine Constructed");
  }
}

interface ITMPSValueProvider {

  String getCurrentPressureValues();
}

class Car {

  private final Engine engine = new Engine();
  private ITMPSValueProvider tpms;
  private String regNumber;

  // Constructor
  Car(final ITMPSValueProvider tpms) {
    this.tpms = tpms;
    System.out.println("Car Constructed with " + this.tpms.getCurrentPressureValues());
  }

  void installTPMS(final ITMPSValueProvider tpms) {
    this.tpms = tpms;
  }
}

public class DepInversion {

  static void buildCar(final ITMPSValueProvider tpms) {
    Car car = new Car(tpms);
  }

  public static void main(final String[] args) {
    BoschTPMS bTpms = new BoschTPMS();
    NexDigitronTPMS ndTpms = new NexDigitronTPMS();

    buildCar(bTpms); // Builds a Car with BoschTPMS
    buildCar(ndTpms); // Builds a Car with NexDigitronTPMS

  }
}

