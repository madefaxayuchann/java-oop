public class PolymorphismApp {
  public static void main(String[] args) {
    Employee employee = new Employee("ayu");
    employee.sayHello("Medya");

    employee = new Manager("Niken");
    employee.sayHello("Medya");

    employee = new VicePresident("Budi");
    employee.sayHello("Joko");

    sayHello(new Employee ("Joko"));
    sayHello(new Manager ("Bud"));
    sayHello(new VicePresident ("Koko"));
  }
  static void sayHello (Employee employee) {
    if (employee instanceof VicePresident) {
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println("Hello VP " + employee.name);
    } else if (employee instanceof Manager) {
      Manager vicePresident = (Manager) employee;
      System.out.println("Hello Manager " + employee.name);
    } else {
      System.out.println("Hello Employee " + employee.name);
    }
  }
}
