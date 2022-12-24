package programmer.zaman.now.data;

public class ProductApp {
  public static void main(String[] args) {
    Product product = new Product("Macbook pro", 3000000);
    Product product2 = new Product("Macbook pro", 3000000);
    System.out.println(product.name);
    System.out.println(product.price);
    System.out.println(product.equals(product2));
    //    wakaranai hashCode ;(
    System.out.println(product.hashCode() == product2.hashCode());
  }
}
