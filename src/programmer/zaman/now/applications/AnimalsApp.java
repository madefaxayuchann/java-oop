package programmer.zaman.now.applications;

import programmer.zaman.now.data.Animal;
import programmer.zaman.now.data.Cat;

public class AnimalsApp {
  public static void main(String[] args) {
    Animal animal = new Cat();
    animal.name = "Eko";
    animal.run();
  }
}
