package programmer.zaman.now.applications;

import programmer.zaman.now.data.Category;

public class CategoryApp {
  //  getter and setter method using for take & change field privet or data sensitive
  public static void main(String[] args) {
    var Category = new Category();
    Category.setId("Id");
    System.out.println(Category.getId());
  }
}
