class Parent {
  String name;

  void doIt() {
    System.out.println("Do it Parents");
  }
}

class Child extends Parent{
  String name;

  void doIt() {
    System.out.println("Do it Child");
  }
}