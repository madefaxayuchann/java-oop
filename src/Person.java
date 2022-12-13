public class Person {
    String name ;
    String address;
    final String country = "Indonesia";

//    method Constructor

    Person(String name, String address) {

      //      tis keyword

      this.name = name;
      this.address = address;
    }

    Person(String paramName) {
      this(paramName, null);
    }

    void sayHello(String name) {
      System.out.println("Hello "+ name + ", My Name is " + this.name);
    }
}
