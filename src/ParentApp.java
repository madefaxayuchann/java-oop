public class ParentApp {
  public static void main(String[] args) {
//    unfinished variable hiding
    Child child = new Child();
    child.name = "AGUSTIN";
    child.doIt();
    System.out.println(child.name);
  }
}
