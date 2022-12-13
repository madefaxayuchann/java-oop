public class ManagerApp {
  public static void main(String[] args) {
    var manager = new Manager();
    manager.name = "Niken";
    manager.sayHello("Medya");

    var vp = new VicePresident();
    vp.name = "Budi";
    vp.sayHello("Joko");
  }
}
