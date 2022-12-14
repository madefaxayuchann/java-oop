//  Inheritance
public class VicePresident extends Manager {

  // overriding : declare back method parent on class child
  // super constructor : class child should access parent constructor
  VicePresident(String name) {
    super(name);
  }
  void sayHello (String name) {
    System.out.println("Hi " + this.name + " My name is VP " + name);
  }
}
