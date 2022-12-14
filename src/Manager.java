class Manager extends Employee{

  String company;

  Manager(String name) {
    super(name);
  }

  Manager(String name, String company) {
    super(name);
    this.company = company;
  }
  void sayHello (String name) {
    System.out.println("Hi " + this.name + " My name is Mnajer " + name);
  }


}
