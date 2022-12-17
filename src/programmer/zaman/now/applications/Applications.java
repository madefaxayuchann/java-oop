package programmer.zaman.now.applications;

// while import using * is this mean import all class on the packageÏ
import programmer.zaman.now.data.*;
import programmer.zaman.now.data.Product;


public class Applications {
  public static void main(String[] args) {
    Product product = new Product("sunscreen", 25000);
    System.out.println(product.name);
    System.out.println(product.price);

    Data data = new Data();
  }
}
