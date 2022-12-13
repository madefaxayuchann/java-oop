public class Person {
    String name ;
    String addres ;
    final String country = "Indonesia";

    void sayHello(String paramName){
        System.out.println("Hello "+ paramName + ", My Name is " + name);
    }
}
