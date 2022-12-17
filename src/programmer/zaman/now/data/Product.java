package programmer.zaman.now.data;

//public is access level where class (y), package(y), subclass(y), world(y)
//protected is access level where class (y), package(y), subclass(y), world(n)
//private is access level where class (y), package(n), subclass(n), world(n)
//no modifier is access level where class (y), package(y), subclass(n), world(n)

public class Product {
  public String name;
  public int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }
}
