package programmer.zaman.now.applications;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApps {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setName("Medya");
    customer.setLevel(Level.PREMIUM);

    System.out.println(customer.getLevel().getDescription());

//    casting enum to string
    String levelStd = Level.STANDAR.name();
    Level level = Level.valueOf("Standar");
    Level[] values = Level.values();
  }
}
