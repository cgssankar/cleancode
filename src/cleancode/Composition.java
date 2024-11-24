
package cleancode;

// its a direct conversion from c++ to java code

class BoschTPMS {

  // Constructor
  BoschTPMS() {
    System.out.println("BoschTPMS Constructed");
  }

  // Destructor (Finalizer)
  @Override
  protected void finalize() throws Throwable {
    System.out.println("BoschTPMS Destructed");
  }
}

class Engine {

  // Constructor
  Engine() {
    System.out.println("Engine Constructed");
  }

  // Destructor (Finalizer)
  @Override
  protected void finalize() throws Throwable {
    System.out.println("Engine Destructed");
  }
}

class Car {

  private final Engine engine = new Engine();
  private final BoschTPMS tpms = new BoschTPMS();

  // Constructor
  Car() {
    System.out.println("Car Constructed");
  }

  // Destructor (Finalizer)
  @Override
  protected void finalize() throws Throwable {
    System.out.println("Car Destructed");
  }
}

public class Composition {

  static void buildCar() {
    Car alto = new Car();
  }

  public static void main(final String[] args) {
    buildCar();
  }
}
