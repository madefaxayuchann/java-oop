//  Inheritance
public class VicePresident extends Manager {

  // overriding : declare back method parent on class child

  void sayHello (String name) {
    System.out.println("Hi " + this.name + " My name is VP " + name);
  }
}
