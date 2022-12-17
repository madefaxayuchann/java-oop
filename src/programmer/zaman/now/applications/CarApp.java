package programmer.zaman.now.applications;

import programmer.zaman.now.data.Avanza;

public class CarApp {
  public static void main(String[] args) {
    var car = new Avanza();
    System.out.println(car.getTier());
    car.drive();
  }
}
