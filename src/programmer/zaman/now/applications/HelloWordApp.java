package programmer.zaman.now.applications;

import programmer.zaman.now.data.HelloWord;

public class HelloWordApp {
  //  this is anonymous class that simple abstract class where can use without create implement class
  public static void main(String[] args) {
    HelloWord english = new HelloWord() {
      public void sayHello() {
        System.out.println("Hello");
      }

      public void sayHello(String name) {
        System.out.println("Hello " + name);
      }
    };
    english.sayHello();
    english.sayHello("AYUMIII ><");
  }
}
