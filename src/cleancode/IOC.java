/*
 * Copyright (c) ETAS GmbH 2024. All rights reserved.
 */
package cleancode;


import java.util.Random;

class IOTCloudCommunicator {

  public int pushMessage(final String message) {
    // Interact with the internet and push the message to MessageQueue
    // If communication is successful, return a value in the range {200-400} status code;
    // otherwise, return an error code {400-500}
    Random random = new Random();
    return 200 + random.nextInt(301); // Range [200, 500]
  }
}

class BNFSpeedSensor {

  public int getCurrentSpeed() {
    Random random = new Random();
    return 1 + random.nextInt(100); // Range [1, 100]
  }
}

class SpeedMonitor {

  private final int speedThreshold;

  public SpeedMonitor(final int speedThreshold) {
    this.speedThreshold = speedThreshold;
  }

  public void monitor() {
    if ((this.speedThreshold < 1) || (this.speedThreshold > 100)) {
      System.out.println("_speedThreshold value must be in the range {1-100}: " + this.speedThreshold);
      return;
    }

    BNFSpeedSensor speedSensorInstance = new BNFSpeedSensor();
    IOTCloudCommunicator cloudCommunicator = new IOTCloudCommunicator();

    int currentSpeedInKmph = speedSensorInstance.getCurrentSpeed();
    System.out.println("Current Speed In Kmph: " + currentSpeedInKmph);

    if (currentSpeedInKmph > this.speedThreshold) {
      double mph = currentSpeedInKmph * 0.621371;
      String message = "Current Speed in Miles: " + mph;
      int statusCode = cloudCommunicator.pushMessage(message);

      if (statusCode > 400) {
        // Log Message to Console
        System.out.println("Error In Communication: Unable to Contact Server. " + message);
      }
    }
  }
}

public class IOC {

  public static void main(final String[] args) {
    SpeedMonitor instance = new SpeedMonitor(10);
    instance.monitor();
    instance.monitor();
    instance.monitor();
    instance.monitor();
    instance.monitor();
  }
}
