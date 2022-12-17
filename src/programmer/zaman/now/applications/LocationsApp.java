package programmer.zaman.now.applications;


import programmer.zaman.now.data.City;

public class LocationsApp {
  public static void main(String[] args) {
    var city = new City();
    city.name = "Jakarta";

    System.out.println(city.name);
  }
}
