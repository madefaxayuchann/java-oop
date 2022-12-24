package programmer.zaman.now.data;

//public is access level where class (y), package(y), subclass(y), world(y)
//protected is access level where class (y), package(y), subclass(y), world(n)
//private is access level where class (y), package(n), subclass(n), world(n)
//no modifier is access level where class (y), package(y), subclass(n), world(n)

import java.util.Objects;

public class Product {
  public String name;
  public int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    Product product = (Product) o;

    if (price != product.price)
      return false;
    return Objects.equals(name, product.name);
  }

    @Override
      public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
      }
}
